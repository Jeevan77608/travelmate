package com.example.travels;

public class trainDetails {

    private String name,email,age,contact,pName,pDest,pTime,pPrice;

    public trainDetails() {
    }

    public trainDetails(String name, String email, String age, String contact, String pName, String pDest, String pTime, String pPrice) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.contact = contact;
        this.pName = pName;
        this.pDest = pDest;
        this.pTime = pTime;
        this.pPrice = pPrice;
    }

    @Override
    public String toString() {
        return  "Name='" + name + '\'' +
                " \nEmail ='" + email + '\'' +
                " \nAge ='" + age + '\'' +
                " \nContact ='" + contact + '\'' +
                " \nTrainName ='" + pName + '\'' +
                " \nTrainDest ='" + pDest + '\'' +
                " \nTrainTime ='" + pTime + '\'' +
                " \nTrainPrice ='" + pPrice + '\'';
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpDest() {
        return pDest;
    }

    public void setpDest(String pDest) {
        this.pDest = pDest;
    }

    public String getpTime() {
        return pTime;
    }

    public void setpTime(String pTime) {
        this.pTime = pTime;
    }

    public String getpPrice() {
        return pPrice;
    }

    public void setpPrice(String pPrice) {
        this.pPrice = pPrice;
    }
}
