package com.bhhan.mongo.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * Created by hbh5274@gmail.com on 2020-08-06
 * Github : http://github.com/bhhan5274
 */
public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> findByName(String name);
}
