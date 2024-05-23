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
    void checkHandleTest(){
        input = "MAYfloweR123";
        socialHandles.createHandle(input);
        assertEquals("@mayflower", socialHandles.getHandles().get(0));
    }

    @Test
    @DisplayName("To check if handle was created with 9 characters or less")
    void checkHandleLessThan9CharactersTest(){
        input = "MAYback";
        socialHandles.createHandle(input);
        assertEquals("@mayback", socialHandles.getHandles().get(0));
    }

    @Test
    @DisplayName("To check if social media handle input is null")
    void checkIfNullTest(){
    }

    @Test
    @DisplayName("To check if social media handle is empty or blank")
    void checkEmptyOrBlankCharactersTest(){}

    @Test
    @DisplayName("To check if handle was added despite multiple attempts")
    void addHandleTest(){
        socialHandles.addHandle("Mike Jones");
        socialHandles.addHandle("Mike jones");
        socialHandles.addHandle("mike jones");
        assertEquals(1, socialHandles.getHandles().size());
    }


    @Test
    @DisplayName("To check that handle is removed from list of all handles")
    public void removeHandleTest(){

    }

}