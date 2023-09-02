package org.example.behavioral.iterator.my_example;

public class Channel {

  private final double frequency;
  private final ChannelTypeEnum TYPE;

  public Channel(double freq, ChannelTypeEnum type) {
    this.frequency = freq;
    this.TYPE = type;
  }

  public double getFrequency() {
    return frequency;
  }

  public ChannelTypeEnum getTYPE() {
    return TYPE;
  }

  @Override
  public String toString() {
    return "Frequency=" + this.frequency + ", Type=" + this.TYPE;
  }
}
