package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("mongoDBService")
public class MongoDBService {
    @Resource(name = "mongoTemplate")
    private MongoTemplate mongoTemplate;
    public <T> T findOne(Query query, Class<T> entityClass){
        ApplicationContext context=new ClassPathXmlApplicationContext("mongoDB.xml");
//        MongoTemplate mongoTemplate= (MongoTemplate) context.getBean("mongoTemplate");
        // 可以直接调用
        return mongoTemplate.findOne(query, entityClass);
    }
}
