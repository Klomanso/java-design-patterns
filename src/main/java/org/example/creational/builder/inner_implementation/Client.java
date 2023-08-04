package org.example.creational.builder.inner_implementation;

import java.time.LocalDate;
import org.example.creational.builder.Address;
import org.example.creational.builder.User;

public class Client {

  public static void main(String[] args) {
    User user = createUser();
    // Client has to provide director with concrete builder
    UserDTO dto = directBuild(UserDTO.builder(), user);
    UserDTO dto1 =
        UserDTO.builder()
            .withAddress(user.getAddress())
            .withBirthday(user.getBirthday())
            .withFirstName(user.getFirstName())
            .withLastName(user.getLastName())
            .build();
    System.out.println(dto);
    System.out.println("------------");
    System.out.println(dto1);

    UserDTO dto2 = UserDTO.builder().withAddress(user.getAddress()).build();
    System.out.println(dto2);

    Test test = Test.builder().withFourth("332").build();

    System.out.println(test);
  }

  /** This method serves the role of director in builder pattern. */
  private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
    return builder
        .withFirstName(user.getFirstName())
        .withLastName(user.getLastName())
        .withBirthday(user.getBirthday())
        .withAddress(user.getAddress())
        .build();
  }

  /** Returns a sample user. */
  public static User createUser() {
    User user = new User();
    user.setBirthday(LocalDate.of(1960, 5, 6));
    user.setFirstName("Ron");
    user.setLastName("Swanson");
    Address address = new Address();
    address.setHouseNumber("100");
    address.setStreet("State Street");
    address.setCity("Pawnee");
    address.setState("Indiana");
    address.setZipcode("47998");
    user.setAddress(address);
    return user;
  }
}
