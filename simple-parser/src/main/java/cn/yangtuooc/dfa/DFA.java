package cn.yangtuooc.dfa;

import cn.yangtuooc.exception.SyntaxException;
import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenBuffer;
import cn.yangtuooc.token.TokenType;

public class DFA {

  private DFAState state = DFAState.INITIAL;

  public TokenBuffer move(CharacterReader reader) {
    TokenBuffer tokenBuffer = new TokenBuffer();
    do {
      if (!reader.hasNext()) {
        return tokenBuffer;
      }
      moveDFA(reader.next(), tokenBuffer);
    } while (reader.hasNext() && !isInitial());
    return tokenBuffer;
  }


  private boolean isInitial() {
    return state == DFAState.INITIAL;
  }

  private void moveDFA(Character ch, TokenBuffer buffer) {
    if (state == DFAState.INITIAL) {
      moveState(ch);
    }
    switch (state) {
      case INT_1 -> {
        if (ch == 'n') {
          moveState(ch);
        }
        buffer.setType(state.tokenType());
        buffer.append(ch);
      }
      case INT_2 -> {
        if (ch == 't') {
          buffer.append(ch);
          moveState(ch);
        }
      }
      case INT_3 -> moveState(ch);
      case ID -> {
        if (isAlpha(ch) || isDigit(ch)) {
          buffer.setType(state.tokenType());
          buffer.append(ch);
          break;
        }
        moveState(ch);
      }
      case INT_LITERAL -> {
        if (isDigit(ch)) {
          buffer.setType(state.tokenType());
          buffer.append(ch);
          break;
        }
        moveState(ch);
      }
      case GT -> {
        if (ch == '=') {
          moveState(ch);
          buffer.append(ch);
        }
        buffer.setType(state.tokenType());
        buffer.append(ch);
      }
      case GE, ASSIGNMENT -> {
        buffer.setType(state.tokenType());
        buffer.append(ch);
        moveState(ch);
      }
    }
  }

  private void moveState(Character ch) {
    switch (ch) {
      case 'i':
        state = DFAState.INT_1;
        break;
      case 'n':
        state = DFAState.INT_2;
        break;
      case 't':
        state = DFAState.INT_3;
        break;
      case '>':
        state = DFAState.GT;
        break;
      case '=':
        if (state == DFAState.GT) {
          state = DFAState.GE;
          break;
        }
        state = DFAState.ASSIGNMENT;
        break;
      case ' ', ';':
        state = DFAState.INITIAL;
        break;
      default:
        if (isAlpha(ch) || isDigit(ch)) {
          if (isDigit(ch) && state != DFAState.ID) {
            state = DFAState.INT_LITERAL;
            break;
          }
          state = DFAState.ID;
          break;
        }
        throw new SyntaxException("unexpected symbol: " + ch);
    }
  }

  /**
   * 根据输入的字符扭转状态
   * FIXME: 修改为根据state读取输入，根据输入扭转状态不符合DFA逻辑图
   * DFA: 根据当前状态接受输入，而不是根据输入扭转状态
   * 见: moveDFA
   *
   * @param character   输入的字符
   * @param tokenBuffer token buffer，用于记录非终结状态下的token字符
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
