package org.example.behavioral.state.my_example;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private final List<String> playlist = new ArrayList<>();
  private State state;
  private boolean playing = false;
  private int currentTrack = 0;

  public Player() {
    this.state = new ReadyState(this);
    setPlaying(true);
    for (int i = 1; i <= 12; i++) {
      playlist.add("Track " + i);
    }
  }

  public void changeState(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  public boolean isPlaying() {
    return playing;
  }

  public void setPlaying(boolean playing) {
    this.playing = playing;
  }

  public String startPlayback() {
    return "Playing " + playlist.get(currentTrack);
  }

  public String nextTrack() {
    currentTrack++;
    if (currentTrack > playlist.size() - 1) {
      currentTrack = 0;
    }
    return "Playing " + playlist.get(currentTrack);
  }

  public String previousTrack() {
    currentTrack--;
    if (currentTrack < 0) {
      currentTrack = playlist.size() - 1;
    }
    return "Playing " + playlist.get(currentTrack);
  }

  public void setCurrentTrackAfterStop() {
    this.currentTrack = 0;
  }
}
