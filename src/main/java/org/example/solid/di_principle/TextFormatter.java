package org.example.solid.di_principle;

public class TextFormatter implements Formatter {

  public String format(Message message) {
    return message.getTimestamp() + ":" + message.getMsg();
  }
}
