package org.example.solid.sr_principle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserMapper {

  ObjectMapper mapper = new ObjectMapper();

  public User map(String userJson) throws JsonProcessingException {
    return mapper.readValue(userJson, User.class);
  }
}
