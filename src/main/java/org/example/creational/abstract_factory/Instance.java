package org.example.creational.abstract_factory;

//Represents an abstract product
public interface Instance {
    void start();

    void attachStorage(Storage storage);

    void stop();

    enum Capacity {micro, small, large}
}
