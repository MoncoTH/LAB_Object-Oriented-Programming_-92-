package student;

public class Student {
    private String stdName, stdID;

    public Student() {
        stdName = "Unknown";
        stdID = "Unknown";
    }

    public void setStdName(String name) {
        stdName = name;
    }

    public String getLogin(String id) {
        stdID = id.substring(1, id.length());
        return stdID;
    }

    public String getPassword() {
        return stdName.substring(0, 4) + stdID.substring(0, 4);
    }
}
