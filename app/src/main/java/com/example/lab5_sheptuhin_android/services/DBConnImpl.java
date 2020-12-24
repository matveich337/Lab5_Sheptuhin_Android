package com.example.lab5_sheptuhin_android.services;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.sql.Connection;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class DBConnImpl implements DBConn {
    private MongoDatabase database;
    private MongoClient mongoClient;

    public DBConnImpl() {
        connect();
    }

    @Override
    public void connect() {
        ConnectionString connectionString =
                new ConnectionString("mongodb://localhost:27017/5Lab_Android");

        CodecRegistry pojoCodecRegistry =
                fromProviders(PojoCodecProvider.builder().automatic(true).build());

        CodecRegistry codecRegistry =
                fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        MongoClientSettings clientSettings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .codecRegistry(codecRegistry)
                .build();
        try {
            mongoClient = MongoClients.create(clientSettings);
            database = mongoClient.getDatabase("5Lab_Android");
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }

    public MongoCollection getCollection(String name, Object t) {
        MongoCollection collection = database.getCollection(name, t.getClass());
        return collection;
    }
}
