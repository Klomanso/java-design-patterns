package org.example.behavioral.command.my_example;

public class CopyCommand extends Command {

  public CopyCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    editor.clipboard = editor.textField.getSelectedText();
    return false;
  }
}
