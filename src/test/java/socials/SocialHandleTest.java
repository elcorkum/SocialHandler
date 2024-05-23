package socials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SocialHandleTest {

    private String input;
    private Handles handles;

    @BeforeEach
    void setUp(){
        input = "";
        handles = new Handles();
    }

    @Test
    @DisplayName("To check if a social media handle was created successfully")
    void checkHandleTest(){
        input = "NEWeRA245";
        SocialHandle social = new SocialHandle(input);
        String createdHandle = Handles.createHandle(input);
        assertEquals(createdHandle, social.getUniqueHandle());

    }

    @Test
    @DisplayName("To check if handle was created with 9 characters or less")
    void checkHandleLessThan9CharactersTest(){
        input = "MAYback";
        handles.addHandle(input);
        assertEquals("@mayback", handles.getHandles().get(0));
    }

    @Test
    @DisplayName("To check if social media handle input is null")
    void checkIfNullTest(){
        input = null;
        assertNull(input);
    }

    @Test
    @DisplayName("To check if social media handle is empty or blank")
    void checkEmptyOrBlankCharactersTest(){
        assertTrue(input.isBlank());
    }

    @Test
    @DisplayName("To check if handle was added despite multiple attempts")
    void addHandleTest(){
        handles.addHandle("Mike Jones");
        handles.addHandle("Mike jones");
        handles.addHandle("mike jones");
        assertEquals(1, handles.getHandles().size());
    }

    @Test
    @DisplayName("To check that handle is successfully removed from list")
    void removeHandleTest(){
        input = "NEWeRA245";
        SocialHandle social = new SocialHandle(input);
        handles.addHandle(social.getUniqueHandle());
        handles.removeHandle(social.getUniqueHandle());
        assertFalse(handles.getHandles().contains(social.getUniqueHandle()));
    }

    @Test
    @DisplayName("To check that handle is updated to a new handle when oldHandle is present")
    void updateHandleTest(){
        input = "MayFloWER345";
        handles.addHandle(input);
        String oldHandle = input;
        String newHandleInput = "7redRobin";
        handles.updateHandle(oldHandle, newHandleInput);
        String newHandle = Handles.createHandle(newHandleInput);

        assertFalse(handles.getHandles().contains(oldHandle));
        assertTrue(handles.getHandles().contains(newHandle));
    }

    @Test
    @DisplayName("To check that handle is updated to a new handle when oldHandle is absent")
    void updateHandleTestWithoutExistingOldHandle(){
        input = "MayFloWER345";
        String newHandleInput = "7redRobin";
        handles.updateHandle(input, newHandleInput);
        assertFalse(handles.checkHandle(newHandleInput));
    }


}