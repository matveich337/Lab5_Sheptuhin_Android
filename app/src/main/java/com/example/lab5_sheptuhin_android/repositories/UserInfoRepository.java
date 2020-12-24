package com.example.lab5_sheptuhin_android.repositories;

import com.example.lab5_sheptuhin_android.models.UserInfo;

import org.bson.types.ObjectId;

public interface UserInfoRepository {
    public UserInfo save(UserInfo userInfo);
    public void deleteAll();
    public void updateById(UserInfo oldUser, UserInfo newUser);
    public void deleteById(ObjectId id);
}
