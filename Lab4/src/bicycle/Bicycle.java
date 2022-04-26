package bicycle;

public class Bicycle {
    private String ownerName;

    public Bicycle() {
    ownerName = "Unknown";
    }
   
    public Bicycle(String name) {
    ownerName = name;
    }
    public String getOwnerName() {
    return ownerName;
    }
   
    public void setOwnerName(String name) {
    ownerName = name;
    }
   
}
