package org.example.solid.di_principle;

import java.io.IOException;

public class FormatException extends IOException {

  public FormatException(Exception cause) {
    super(cause);
  }
}
