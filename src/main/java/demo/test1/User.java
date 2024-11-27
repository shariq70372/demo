package demo.test1;

public class User {
    private String name;  // Store user's name

    public void setUserInfo(String name) {
        this.name = name;  // Set the name
    }

    public void displayUserInfo() {
        System.out.println("Name: " + name);
    }
}
