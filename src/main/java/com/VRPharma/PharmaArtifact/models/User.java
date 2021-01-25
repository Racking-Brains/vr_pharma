package com.VRPharma.PharmaArtifact.models;

import org.hibernate.id.GUIDGenerator;
import org.springframework.data.annotation.Id;

public class User {

    @Id
    private int id;
    private String userName;
    private String passwd;
    private String email;

    public User(String userName,String passwd, String email){
        this.id = new GUIDGenerator().hashCode();
        this.userName = userName;
        this.passwd = passwd;
        this.email = email;
    }

    public  User(int id,String userName,String passwd, String email){
        this.id = id;
        this.userName = userName;
        this.passwd = passwd;
        this.email = email;
    }

    public User() {
    }

    public int getId() {
        return GUIDGenerator.class.hashCode();
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passwd='" + passwd + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
