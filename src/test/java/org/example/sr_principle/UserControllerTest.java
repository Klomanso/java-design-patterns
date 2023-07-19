package org.example.sr_principle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserControllerTest {

    private static final String VALID_USER_JSON
        = "{\"name\": \"Randy\", \"email\": \"randy@email.com\", \"address\":\"110 Sugar lane\"}";
    private static final String INVALID_USER_JSON
        = "{\"name\": \"Sam\", \"email\": \"sam@email\", \"address\":\"111 Sugar lane\"}";
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";


    @Test
    @DisplayName("Valid user can be created")
    void testCreateUser_whenValidUserProvided_returnsSuccess() throws IOException {
        // Arrange
        UserController userController = new UserController();

        // Act
        String response = userController.createUser(VALID_USER_JSON);
        String actual = response.toLowerCase();

        // Assert
        assertEquals(SUCCESS, actual);
    }

    @Test
    @DisplayName("Invalid user cannot be created")
    void testCreateUser_whenInvalidUserProvided_returnsError() throws IOException {
        // Given
        UserController userController = new UserController();

        // When
        String response = userController.createUser(INVALID_USER_JSON);
        String actual = response.toLowerCase();

        // Then
        assertEquals(ERROR, actual);
    }
}