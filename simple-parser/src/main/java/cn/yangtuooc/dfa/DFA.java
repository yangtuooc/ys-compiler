package cn.yangtuooc.dfa;

import cn.yangtuooc.exception.SyntaxException;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenBuffer;
import cn.yangtuooc.token.TokenStream;
import cn.yangtuooc.token.TokenType;

public class DFA {

  private DFAState state = DFAState.INITIAL;

  private final TokenStream tokenStream = new TokenStream();

  public TokenStream move(CharacterReader reader) {
    while (reader.hasNext()) {
      TokenBuffer buffer = new TokenBuffer();
      moveDFA(reader, buffer);
      tokenStream.append(buffer);
    }
    return tokenStream;
  }


  private boolean isInitial() {
    return state == DFAState.INITIAL;
  }

  private void moveDFA(CharacterReader reader, TokenBuffer buffer) {
    do {
      if (!reader.hasNext()) {
        break;
      }
      Character ch = reader.next();
      state = moveState(state, ch);
      if (state == DFAState.INITIAL) {
        break;
      }
      buffer.setType(state.tokenType());
      buffer.append(ch);

      if (reader.hasNext()) {
        if (moveState(state, reader.peek()) == DFAState.SEMICOLON) {
          break;
        }
      }
    } while (true);
  }

  private DFAState moveState(DFAState currentState, Character ch) {
    return switch (ch) {
      case 'i' -> DFAState.INT_1;
      case 'n' -> DFAState.INT_2;
      case 't' -> DFAState.INT_3;
      case '>' -> DFAState.GT;
      case '=' -> {
        if (state == DFAState.GT) {
          yield DFAState.GE;
        }
        yield DFAState.ASSIGNMENT;
      }
      case ';' -> DFAState.SEMICOLON;
      case ' ' -> DFAState.INITIAL;
      default -> {
        if (isAlpha(ch) || isDigit(ch)) {
          if (isDigit(ch) && currentState != DFAState.ID) {
            yield DFAState.INT_LITERAL;
          }
          yield DFAState.ID;
        }
        throw new SyntaxException("unexpected symbol: " + ch);
      }
    };
  }

  /**
   * 根据输入的字符扭转状态
   * FIXME: 修改为根据state读取输入，根据输入扭转状态不符合DFA逻辑图
   * DFA: 根据当前状态接受输入，而不是根据输入扭转状态
   * 见: moveDFA
   *
   * @param character   输入的字符
   * @param tokenBuffer token buffer，用于记录非终结状态下的token字符
   * @deprecated use moveDFA to instead
   */
  private void move(Character character, TokenBuffer tokenBuffer) {
    switch (character) {
      case 'i':
        state = DFAState.INT_1;
        tokenBuffer.setType(TokenType.ID);
        tokenBuffer.append(character);
        break;
      case 'n':
        if (state == DFAState.INT_1) {
          state = DFAState.INT_2;
          tokenBuffer.append(character);
          break;
        }
        state = DFAState.ID;
        tokenBuffer.append(character);
        break;
      case 't':
        if (state == DFAState.INT_2) {
          state = DFAState.INT_3;
          tokenBuffer.append(character);
          break;
        }
        state = DFAState.ID;
        tokenBuffer.append(character);
        break;
      case '>':
        state = DFAState.GT;
        tokenBuffer.append(character);
        tokenBuffer.setType(TokenType.GT);
        break;
      case ' ':
      case ';':
        state = DFAState.INITIAL;
        break;
      case '=':
        if (state == DFAState.GT) {
          state = DFAState.GE;
          tokenBuffer.setType(TokenType.GE);
          tokenBuffer.append(character);
          break;
        }
        state = DFAState.ASSIGNMENT;
        tokenBuffer.setType(TokenType.ASSIGNMENT);
        tokenBuffer.append(character);
        break;
      default:
        if (isDigit(character) && state != DFAState.ID) {
          state = DFAState.INT_LITERAL;
          tokenBuffer.setType(TokenType.INT_LITERAL);
          tokenBuffer.append(character);
          break;
        }
        if (isAlpha(character)) {
          state = DFAState.ID;
          tokenBuffer.setType(TokenType.ID);
          tokenBuffer.append(character);
          break;
        }
        throw new SyntaxException("unexpected symbol: " + character);
    }

  }

  private boolean isAlpha(Character character) {
    return character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z';
  }

  private boolean isDigit(Character character) {
    return character >= '0' && character <= '9';
  }
}
