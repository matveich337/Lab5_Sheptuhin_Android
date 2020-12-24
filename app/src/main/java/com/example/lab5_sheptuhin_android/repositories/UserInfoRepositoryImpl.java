package com.example.lab5_sheptuhin_android.repositories;

import com.example.lab5_sheptuhin_android.models.UserInfo;
import com.example.lab5_sheptuhin_android.services.DBConn;
import com.example.lab5_sheptuhin_android.services.DBConnImpl;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;

import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class UserInfoRepositoryImpl implements UserInfoRepository {
    private final DBConn dbConn = new DBConnImpl();
    private MongoCollection mongoCollection;

    public UserInfoRepositoryImpl() {
        this.mongoCollection = dbConn.getCollection("user_info", new UserInfo());
    }

    @Override
    public UserInfo save(UserInfo userInfo) {
        try {
            mongoCollection.insertOne(userInfo);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
        return userInfo;
    }

    @Override
    public void deleteAll() {
        BasicDBObject basicDBObject = new BasicDBObject();
        mongoCollection.deleteMany(basicDBObject);
    }

    @Override
    public void updateById(UserInfo oldUser, UserInfo newUser) {
        mongoCollection.findOneAndReplace(eq("_id", oldUser.getId()), newUser);
    }

    @Override
    public void deleteById(ObjectId id) {
        mongoCollection.findOneAndDelete(eq("_id", id));
    }
}
