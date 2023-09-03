package org.example.behavioral.memento.my_example;

public class TextEditor {

  private final TextWindow textWindow;
  private TextWindowState savedTextWindow;

  public TextEditor(TextWindow textWindow) {
    this.textWindow = textWindow;
  }

  public void hitSave() {
    savedTextWindow = textWindow.save();
  }

  public void hitUndo() {
    textWindow.restore(savedTextWindow);
  }

  public void write(String s) {
    textWindow.addText(s);
  }

  public String read() {
    if (savedTextWindow != null) {
      return savedTextWindow.getText();
    }
    return null;
  }
}
