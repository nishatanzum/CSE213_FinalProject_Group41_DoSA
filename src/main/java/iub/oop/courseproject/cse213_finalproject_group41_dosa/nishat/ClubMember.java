package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import iub.oop.courseproject.cse213_finalproject_group41_dosa.User;

public class ClubMember extends User {
    private String userId, name, email, phone, clubRole;

    public ClubMember() {
    }

    public ClubMember(String userId, String name, String email, String phone, String clubRole) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.clubRole = clubRole;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClubRole() {
        return clubRole;
    }

    public void setClubRole(String clubRole) {
        this.clubRole = clubRole;
    }


    @Override
    public String toString() {
        return "ClubMember{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", clubRole='" + clubRole + '\'' +
                '}';
    }
}
