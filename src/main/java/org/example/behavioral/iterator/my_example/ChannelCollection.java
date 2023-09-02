package org.example.behavioral.iterator.my_example;

public interface ChannelCollection {

  void addChannel(Channel c);

  void removeChannel(Channel c);

  ChannelIterator iterator(ChannelTypeEnum type);
}
