package socials;

import java.util.ArrayList;
import java.util.Scanner;

public class Handles {
    private ArrayList<String> handles;

    public ArrayList<String> getHandles() {
        return handles;
    }

    public Handles(){
        handles = new ArrayList<>();
    }

    public boolean checkHandle(String input){
        String createdHandle = "";
        if(!input.isBlank()){
            if(input.length() < 9){
                createdHandle = String.format("@%s", input.toLowerCase());
            }else{
                createdHandle = String.format("@%s", input.substring(0, 10).toLowerCase());
            }
        }
        return handles.contains(createdHandle);
    }
    public void addHandle(String input){
        boolean handleExists = checkHandle(input) ;
        String newUserHandle;
        if(!handleExists && !input.isBlank()){
            if(input.length() < 9){
                newUserHandle = String.format("@%s", input.toLowerCase());
            }else{
                newUserHandle = String.format("@%s", input.substring(0, 10).toLowerCase());
            }
            SocialHandle handle = new SocialHandle(newUserHandle);
            handles.add(handle.getUniqueHandle());
        }


    }

    public void createHandle(){
        Scanner scanner = new Scanner(System.in);
        int i = 1;

        while (i == 1) {
            try{
                System.out.println("Please enter username: ");
                String username = scanner.nextLine();
                if (username.isBlank()) {
                    throw new NullPointerException("Invalid entry. Please use characters and/or numbers: ");
                }else {
                    String newUserHandle ="";
                    if(username.length() < 9){
                        newUserHandle = String.format("@%s", username);
                    }else{
                        newUserHandle= String.format("@%s", username.substring(0, 10)).toLowerCase();
                    }
                    if (handles.contains(newUserHandle)) {
                        System.out.println("Handle already exists. Please enter unique handle: ");
                        scanner.nextLine();
                    } else {
                        SocialHandle handle = new SocialHandle(newUserHandle);
                        handles.add(handle.getUniqueHandle());
                        i = 2;
                    }
                }

            }catch(NullPointerException e){
                e.getMessage();
            }finally{
                scanner.close();
            }
        }
    }


}
