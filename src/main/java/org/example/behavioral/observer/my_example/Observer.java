package org.example.behavioral.observer.my_example;

public interface Observer {

  // method to update the observer, used by subject
  void update();

  // attach with subject to observe
  void setSubject(Subject sub);
}
