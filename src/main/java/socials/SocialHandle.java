package socials;

import java.util.ArrayList;
import java.util.HashMap;

public class SocialHandle {
    private String uniqueHandle;

    private ArrayList<String> handles = new ArrayList<>();


    public SocialHandle(String uniqueHandle){
        this.uniqueHandle = createHandle(uniqueHandle);
    }

    public String getUniqueHandle() {
        return uniqueHandle;
    }

    public ArrayList<String> getHandles() {
        return handles;
    }

    public String createHandle(String username) {
        String newUserHandle = "";
        try{
            if (username.isBlank()) {
                throw new NullPointerException("Invalid entry. Please use characters and/or numbers: ");
            } else {
                if (username.length() < 9) {
                    newUserHandle = String.format("@%s", username).toLowerCase();
                } else {
                    newUserHandle = String.format("@%s", username.substring(0, 9)).toLowerCase();
                }
            }
        }catch(NullPointerException e){
            e.getMessage();
        }
        return newUserHandle;
    }

    public boolean checkHandle(String input) {
        String createdHandle = "";
        if (!input.isBlank()) {
            if (input.length() < 9) {
                createdHandle = String.format("@%s", input.toLowerCase());
            } else {
                createdHandle = String.format("@%s", input.substring(0, 9).toLowerCase());
            }
        }
        return handles.contains(createdHandle);
    }
    public void addHandle(String input) {
        boolean handleExists = checkHandle(input);
        String newUserHandle;
        if (!handleExists && !input.isBlank()) {
            newUserHandle = createHandle(input);
            handles.add(newUserHandle);
        }
    }

    public void removeHandle(String input){
        boolean handleExists = checkHandle(input);
        if(handleExists){
            handles.remove(input);
        }
    }

    public void updateHandle(String oldHandle, String newHandle){
        boolean handleExists = checkHandle(oldHandle);
        if(handleExists){
            handles.remove(oldHandle);
            String updatedHandle = createHandle(newHandle);
            handles.add(updatedHandle);
        }
    }
}
