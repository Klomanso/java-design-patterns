package org.example.behavioral.iterator.my_example;

import java.util.ArrayList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

  private final List<Channel> channelsList;

  public ChannelCollectionImpl() {
    channelsList = new ArrayList<>();
  }

  public void addChannel(Channel c) {
    this.channelsList.add(c);
  }

  public void removeChannel(Channel c) {
    this.channelsList.remove(c);
  }

  @Override
  public ChannelIterator iterator(ChannelTypeEnum type) {
    return new ChannelIteratorImpl(type, this.channelsList);
  }

  private static class ChannelIteratorImpl implements ChannelIterator {

    private final ChannelTypeEnum type;
    private final List<Channel> channels;
    private int position;

    public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> channelsList) {
      this.type = ty;
      this.channels = channelsList;
    }

    @Override
    public boolean hasNext() {
      while (position < channels.size()) {
        Channel c = channels.get(position);
        if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
          return true;
        } else position++;
      }
      return false;
    }

    @Override
    public Channel next() {
      Channel c = channels.get(position);
      position++;
      return c;
    }
  }
}
