package com.example.lab5_sheptuhin_android.models;

import org.bson.codecs.pojo.annotations.BsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class UserInfo extends BaseEntity {
    @BsonProperty(value = "name")
    private String Name;
    @BsonProperty(value = "surname")
    private String Surname;
    @BsonProperty(value = "phone_number")
    private String PhoneNumber;
    @BsonProperty(value = "email")
    private String Email;
    @BsonProperty(value = "adress")
    private String Adress;

    public UserInfo(String Name, String Surname, String PhoneNumber, String Email, String Adress) {
        this.Name = Name;
        this.Surname = Surname;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.Adress = Adress;
    }

    public UserInfo() {
    }
}

