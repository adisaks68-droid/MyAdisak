package com.example.myadisak;

public class Note {
    //attribute
    String title;
    String content;
    String createdDate;
    //method
    void  show(){
        System.out.println(this.title);
        System.out.println(this.content+""+this.createdDate);
    }
}
