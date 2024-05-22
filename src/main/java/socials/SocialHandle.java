package socials;

import java.util.HashMap;

public class SocialHandle {
    private String uniqueHandle;
    private static int sharedId;
    private final int uniqueID;

    public String getUniqueHandle() {
        return uniqueHandle;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public SocialHandle(String uniqueHandle){
        this();
        this.uniqueHandle = uniqueHandle;
    }
    public SocialHandle(){
        sharedId++;
        uniqueID = sharedId;
    }


}
