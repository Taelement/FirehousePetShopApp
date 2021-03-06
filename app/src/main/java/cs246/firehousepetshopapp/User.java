package cs246.firehousepetshopapp;

/**
 * Created by sam on 6/9/2017.
 */

public class User {


    private String userName;
    private String password;
    private String email;
    private boolean isManager;

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public User() {
        userName = null;
        password = null;
        email = null;
    }

    public User(String n) {
        userName = n;
        password = null;
        email = null;
    }
    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
