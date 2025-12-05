package iub.oop.courseproject.cse213_finalproject_group41_dosa;

public abstract class User {
    protected int ID;
    protected String Password, userType;


    public User() {
    }


    public User(int ID, String password, String userType) {
        this.ID = ID;
        Password = password;
        this.userType = userType;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }


    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", Password='" + Password + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
