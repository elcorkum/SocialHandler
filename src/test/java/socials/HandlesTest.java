package socials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlesTest {
    private Handles socialHandles;
    private String input;

    @BeforeEach
    void setUp(){
        socialHandles = new Handles();
        input = "";
    }

    @Test
    @DisplayName("To check if a social media handle was created successfully")
    void checkHandleTest(){}

    @Test
    @DisplayName("To check if handle was created with 9 characters or less")
    void checkHandleLessThan9CharactersTest(){}

    @Test
    @DisplayName("To check if social media handle input is null")
    void checkIfNullTest(){}

    @Test
    @DisplayName("To check if social media handle is empty or blank")
    void checkEmptyOrBlankCharactersTest(){}

    @Test
    @DisplayName("To check if handle was added despite multiple attempts")
    void addHandleTest(){}

}