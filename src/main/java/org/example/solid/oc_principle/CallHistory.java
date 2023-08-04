package org.example.solid.oc_principle;

import java.time.LocalDateTime;
import java.util.*;

public class CallHistory {

  private static final Map<Long, List<Call>> CALLS = new HashMap<>();

  public static synchronized List<Call> getCurrentCalls(Long subscriberId) {
    if (!CALLS.containsKey(subscriberId)) {
      return Collections.emptyList();
    }
    return CALLS.get(subscriberId);
  }

  public static synchronized void addSession(
      Long subscriberId, LocalDateTime begin, long duration) {
    List<Call> calls;
    if (!CALLS.containsKey(subscriberId)) {
      calls = new LinkedList<>();
      CALLS.put(subscriberId, calls);
    } else {
      calls = CALLS.get(subscriberId);
    }
    calls.add(new Call(subscriberId, begin, duration));
  }

  public static class Call {

    private final LocalDateTime begin;

    private final long duration;

    private final Long subscriberId;

    public Call(Long subscriberId, LocalDateTime begin, long duration) {
      this.begin = begin;
      this.duration = duration;
      this.subscriberId = subscriberId;
    }

    /**
     * @return the begin
     */
    public LocalDateTime getBegin() {
      return begin;
    }

    /**
     * @return the duration
     */
    public long getDuration() {
      return duration;
    }

    /**
     * @return the subscriber
     */
    public Long getSubscriberId() {
      return subscriberId;
    }
  }
}
