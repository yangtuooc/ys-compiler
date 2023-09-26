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


  private void moveDFA(CharacterReader reader, TokenBuffer buffer) {
    while (reader.hasNext()) {
      Character ch = reader.next();
      state = moveState(state, ch);
      if (state.isUnknown()) {
        throw new SyntaxException("syntax error: unexpected symbol '" + ch + "'");
      }
      if (state.isInitial()) {
        break;
      }
      buffer.append(ch);
      buffer.setType(state.tokenType());

      if (state.isSemicolon()) {
        state = DFAState.INITIAL;
        break;
      }
      if (reader.hasNext()) {
        DFAState nextState = moveState(state, reader.peek());
        if (nextState.isUnknown() || nextState.isSemicolon()) {
          state = DFAState.INITIAL;
          break;
        }
      }
    }
  }

  private DFAState moveState(DFAState currentState, Character ch) {
    return switch (ch) {
      case 'i' -> {
        if (currentState == DFAState.INITIAL) {
          yield DFAState.INT_1;
        }
        yield DFAState.ID;
      }
      case 'n' -> {
        if (currentState == DFAState.INT_1) {
          yield DFAState.INT_2;
        }
        yield DFAState.ID;
      }
      case 't' -> {
        if (currentState == DFAState.INT_2) {
          yield DFAState.INT_3;
        }
        yield DFAState.ID;
      }
      case '>' -> {
        if (currentState == DFAState.INITIAL) {
          yield DFAState.GT;
        }
        yield DFAState.UNKNOWN;
      }
      case '=' -> {
        if (currentState == DFAState.GT) {
          yield DFAState.GE;
        }
        if (currentState == DFAState.INITIAL) {
          yield DFAState.ASSIGNMENT;
        }
        yield DFAState.UNKNOWN;
      }
      case '+' -> {
        if (currentState == DFAState.INITIAL) {
          yield DFAState.PLUS;
        }
        yield DFAState.UNKNOWN;
      }
      case '-' -> {
        if (currentState == DFAState.INITIAL) {
          yield DFAState.MINUS;
        }
        yield DFAState.UNKNOWN;
      }
      case '*' -> {
        if (currentState == DFAState.INITIAL) {
          yield DFAState.MUL;
        }
        yield DFAState.UNKNOWN;
      }
      case '/' -> {
        if (currentState == DFAState.INITIAL) {
          yield DFAState.DIV;
        }
        yield DFAState.UNKNOWN;
      }
      case ';' -> {
        if (currentState != DFAState.ASSIGNMENT && currentState != DFAState.GT && currentState != DFAState.GE) {
          yield DFAState.SEMICOLON;
        }
        yield DFAState.UNKNOWN;
      }
      case ' ' -> DFAState.INITIAL;
      default -> {
        if (
            currentState != DFAState.ID
                && currentState != DFAState.INT_LITERAL
                && !currentState.isInitial()
                && currentState != DFAState.INT_1
                && currentState != DFAState.INT_2
                && currentState != DFAState.INT_3
        ) {
          yield DFAState.UNKNOWN;
        }
        if (isAlpha(ch) || isDigit(ch)) {
          if (isDigit(ch) && currentState != DFAState.ID) {
            yield DFAState.INT_LITERAL;
          }
          yield DFAState.ID;
        }
        yield DFAState.UNKNOWN;
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
