package org.example.behavioral.memento.my_example;

public class Demo {
  public static void main(String[] args) {
    TextEditor textEditor = new TextEditor(new TextWindow());
    textEditor.write("Hello");
    System.out.println(textEditor.read());
    textEditor.hitSave();
    System.out.println(textEditor.read());
    textEditor.write("World");
    textEditor.hitUndo();
    System.out.println(textEditor.read());
  }
}
