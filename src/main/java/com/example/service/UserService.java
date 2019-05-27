package com.example.service;

import com.example.entity.User;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

@Service
public class UserService extends MongoDBService {

    public User findUserByName(String name){
        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("name").is("cjj"));
        Query query = new Query(criteria);
        return findOne(query, User.class);
    }
}
