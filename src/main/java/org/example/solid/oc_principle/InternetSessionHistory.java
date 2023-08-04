package org.example.solid.oc_principle;

import java.time.LocalDateTime;
import java.util.*;

public class InternetSessionHistory {

  private static final Map<Long, List<InternetSession>> SESSIONS = new HashMap<>();

  public static synchronized List<InternetSession> getCurrentSessions(Long subscriberId) {
    if (!SESSIONS.containsKey(subscriberId)) {
      return Collections.emptyList();
    }
    return SESSIONS.get(subscriberId);
  }

  public static synchronized void addSession(
      Long subscriberId, LocalDateTime begin, long dataUsed) {
    List<InternetSession> sessions;
    if (!SESSIONS.containsKey(subscriberId)) {
      sessions = new LinkedList<>();
      SESSIONS.put(subscriberId, sessions);
    } else {
      sessions = SESSIONS.get(subscriberId);
    }
    sessions.add(new InternetSession(subscriberId, begin, dataUsed));
  }

  public static class InternetSession {

    private final LocalDateTime begin;

    private final Long subscriberId;

    private final Long dataUsed;

    public InternetSession(Long subscriberId, LocalDateTime begin, long dataUsed) {
      this.begin = begin;
      this.dataUsed = dataUsed;
      this.subscriberId = subscriberId;
    }

    /**
     * @return the begin
     */
    public LocalDateTime getBegin() {
      return begin;
    }

    /**
     * @return the data used
     */
    public long getDataUsed() {
      return dataUsed;
    }

    /**
     * @return the subscriber
     */
    public Long getSubscriberId() {
      return subscriberId;
    }
  }
}
