package com.example.lab5_sheptuhin_android.services;

import com.mongodb.client.MongoCollection;

public interface DBConn {
    public void connect();
    public MongoCollection getCollection(String name, Object t);
}
