package org.example.behavioral.mediator;

/** Common component interface. */
public interface Component {
  void setMediator(Mediator mediator);

  String getName();
}
