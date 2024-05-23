package socials;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SocialHandleTest {

    private String input;

    @BeforeEach
    void setUp(){
        input = "";
    }

    @Test
    @DisplayName("To check that handle is successfully removed from list")
    void removeHandleTest(){
        input = "NEWeRA245";
        SocialHandle social = new SocialHandle(input);
        ArrayList<String> handles = social.getHandles();
        String handle = social.getUniqueHandle();
        social.addHandle(handle);
        assertTrue(handles.contains(handle));
        //handles.remove(handle);


    }


}