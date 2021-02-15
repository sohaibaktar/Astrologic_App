package com.b.chatapp_personal;

public class User {
    private String uid,name,phoneNumber,prifileImage;

    public User() {
    }

    public User(String uid, String name, String phoneNumber, String prifileImage) {
        this.uid = uid;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.prifileImage = prifileImage;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPrifileImage() {
        return prifileImage;
    }

    public void setPrifileImage(String prifileImage) {
        this.prifileImage = prifileImage;
    }
}
