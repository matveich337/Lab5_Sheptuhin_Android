package com.example.lab5_sheptuhin_android.models;

import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class BaseEntity implements Serializable {
    @BsonId
    private ObjectId id;

    public ObjectId getId() {
        return this.id;
    }
}
