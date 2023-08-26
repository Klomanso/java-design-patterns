package org.example.behavioral.command.my_example;

public abstract class Command {
  public Editor editor;
  private String backup;

  Command(Editor editor) {
    this.editor = editor;
  }

  void backup() {
    backup = editor.textField.getText();
  }

  public void undo() {
    editor.textField.setText(backup);
  }

  public abstract boolean execute();
}
