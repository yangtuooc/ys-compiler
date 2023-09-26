package cn.yangtuooc.dfa;

import cn.yangtuooc.reader.CharacterReader;
import cn.yangtuooc.token.TokenStatement;
import cn.yangtuooc.token.TokenType;

public class DFA {

  private DFAState state = DFAState.INITIAL;

  public TokenStatement move(CharacterReader reader) {
    TokenStatement tokenStatement = new TokenStatement();
    do {
      if (!reader.hasNext()) {
        return tokenStatement;
      }
      move(reader.next(), tokenStatement);
    } while (reader.hasNext() && !isInitial());
    return tokenStatement;
  }

  private boolean isInitial() {
    return state == DFAState.INITIAL;
  }


  private void move(Character character, TokenStatement statement) {
    switch (character) {
      case 'i':
        state = DFAState.INT_1;
        statement.setType(TokenType.ID);
        statement.append(character);
        break;
      case 'n':
        if (state == DFAState.INT_1) {
          state = DFAState.INT_2;
          statement.append(character);
          break;
        }
        state = DFAState.ID;
        statement.append(character);
        break;
      case 't':
        if (state == DFAState.INT_2) {
          state = DFAState.INITIAL;
          statement.append(character);
          break;
        }
        state = DFAState.ID;
        statement.append(character);
        break;
      case ' ':

      case ';':
        state = DFAState.INITIAL;
        break;
      case '=':
        state = DFAState.INITIAL;
        statement.setType(TokenType.ASSIGNMENT);
        statement.append(character);
      default:
        if (isAlpha(character) || isDigit(character)) {
          state = DFAState.ID;
          statement.setType(TokenType.ID);
          statement.append(character);
        }
    }
  }

  private boolean isAlpha(Character character) {
    return character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z';
  }

  private boolean isDigit(Character character) {
    return character >= '0' && character <= '9';
  }
}
