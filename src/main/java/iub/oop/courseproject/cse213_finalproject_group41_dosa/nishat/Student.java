package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import iub.oop.courseproject.cse213_finalproject_group41_dosa.User;

public class Student extends User {

    private String name, email, joinedClub, password;

    public Student() {
    }

    public Student(String name, String email, String joinedClub, String password) {
        this.name = name;
        this.email = email;
        this.joinedClub = joinedClub;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJoinedClub() {
        return joinedClub;
    }

    public void setJoinedClub(String joinedClub) {
        this.joinedClub = joinedClub;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", joinedClub='" + joinedClub + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
