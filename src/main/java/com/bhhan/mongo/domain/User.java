package com.bhhan.mongo.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by hbh5274@gmail.com on 2020-08-06
 * Github : http://github.com/bhhan5274
 */

@Document(collection = "Users")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class User {
    @Id
    private String id;

    private String name;
    private String address;

    @Builder
    public User(String id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
