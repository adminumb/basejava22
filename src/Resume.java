/**
 * Initial resume class
 */
public class Resume {

    // Unique identifier
    String uuid;

    @Override
    public String toString() {
        return uuid;
    }

    public String getUuid(){
        return this.uuid;
    }
    public void setUuid(String uuid){
        this.uuid=uuid;
    }

}
