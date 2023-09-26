package cn.yangtuooc.reader;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharacterReader implements SimpleReader {

  private final CharArrayReader charArrayReader;

  public CharacterReader(String input) {
    this.charArrayReader = new CharArrayReader(input.toCharArray());
  }

  @Override
  public boolean hasNext() {
    try {
      return this.charArrayReader.ready();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Character next() {
    try {
      int read = this.charArrayReader.read();
      return (char) read;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}