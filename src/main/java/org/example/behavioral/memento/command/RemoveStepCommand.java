package org.example.behavioral.memento.command;

import org.example.behavioral.memento.WorkflowDesigner;

public class RemoveStepCommand extends AbstractWorkflowCommand {

  private final String step;

  public RemoveStepCommand(WorkflowDesigner designer, String step) {
    super(designer);
    this.step = step;
  }

  @Override
  public void execute() {
    memento = receiver.getMemento();
    receiver.removeStep(step);
  }
}
