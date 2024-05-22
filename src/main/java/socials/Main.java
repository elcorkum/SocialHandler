package socials;

public class Main {

    public static void main(String[] args) {
        Handles handles = new Handles();
        handles.createHandle();
        for(String handle: handles.getHandles()){
            System.out.println(handle);
        }
    }

}
