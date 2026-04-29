package com.example.myadisak;

public class User {
    public String name;
    public String email;
    public String gender;
    public String username;
    public String password;
    public String birthday;
    public String createdAt;
    public String updatedAt;

    public User(String name, String email, String gender, String username, String password, String birthday) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.createdAt = "29/04/2024";
        this.updatedAt = "29/04/2024";
    }

    public void getSummary(){
        System.out.println(this.name+":"+this.email+" "+this.gender+" "+this.username+" "+this.password+" "+this.birthday+" "+this.createdAt+" "+this.updatedAt);
    }
}
