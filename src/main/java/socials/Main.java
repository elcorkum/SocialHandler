package socials;

public class Main {

    public static void main(String[] args) {

        Handles handles = new Handles();
        String handleInput = "launcher3.0";
        SocialHandle handle = new SocialHandle(handleInput);
        handles.addHandle(handleInput);
        handles.addHandle("wickJOhn");
        handles.addHandle("jane DOE");
        handles.addHandle("june DOE");
        handles.addHandle("JAne DOE");
        handles.updateHandle("wickJOhn", "the100");
        handles.writeToFile();
        handles.readFromFile();


    }

}
