package org.example.solid.sr_principle;

import java.io.IOException;

// Handles incoming JSON requests that work on User resource/entity
public class UserController {

  UserMapper mapper = new UserMapper();
  UserPersistenceService persistenceService = new UserPersistenceService();

  public String createUser(String userJson) throws IOException {
    User user = mapper.map(userJson);

    UserValidator validator = new UserValidator();
    boolean valid = validator.validateUser(user);

    if (!valid) {
      return "ERROR";
    }

    persistenceService.saveUser(user);

    return "SUCCESS";
  }
}
