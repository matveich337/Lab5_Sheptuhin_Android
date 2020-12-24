package com.example.lab5_sheptuhin_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab5_sheptuhin_android.models.UserInfo;
import com.example.lab5_sheptuhin_android.repositories.UserInfoRepository;
import com.example.lab5_sheptuhin_android.repositories.UserInfoRepositoryImpl;

public class MainActivity extends AppCompatActivity {
//    private final UserInfoRepository userInfoRepository = new UserInfoRepositoryImpl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        UserInfo userInfo = new UserInfo("name", "surname",
//                "phone_number", "email", "adress");
//
//        System.out.println("dsadas");
//        userInfoRepository.save(userInfo);
    }
}