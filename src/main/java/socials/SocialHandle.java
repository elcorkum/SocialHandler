package socials;

public class SocialHandle {
    private String uniqueHandle;

    public SocialHandle(String uniqueHandle){
        this.uniqueHandle = Handles.createHandle(uniqueHandle);
    }

    public String getUniqueHandle() {
        return uniqueHandle;
    }

}
