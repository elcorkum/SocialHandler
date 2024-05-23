package socials;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Handles {
    private ArrayList<String> handles = new ArrayList<>();

    public ArrayList<String> getHandles() {
        return handles;
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


    public static String createHandle(String username) {
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

    public void removeHandle(String input){
        boolean handleExists = checkHandle(input);
        if(handleExists){
            handles.remove(createHandle(input));
        }
    }
    public void updateHandle(String oldHandle, String newHandle){
        boolean handleExists = checkHandle(oldHandle);
        if(handleExists){
            removeHandle(oldHandle);
            addHandle(newHandle);
        } else{
            System.out.println("Social handle was not found");
        }
    }

    public void writeToFile(){
        Set<String> uniquesHandles = new TreeSet<>(handles);
        File file = new File("C:\\Users\\lizzy\\IdeaProjects\\socialHandler\\src\\main\\resources\\socialHandles.txt");
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(file);
            Iterator<String> handlesIterator = uniquesHandles.iterator();
            while(handlesIterator.hasNext()){
                fileWriter.write(handlesIterator.next() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Unable to write to file");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Unable to close file");
            }
        }
    }


    public void readFromFile(){
        File file = new File("C:\\Users\\lizzy\\IdeaProjects\\socialHandler\\src\\main\\resources\\socialHandles.txt");
        Scanner reader = null;
        try {
            reader = new Scanner(file);
            while(reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not read from file");
        } finally {
            assert reader != null;
            reader.close();
        }
    }






}






