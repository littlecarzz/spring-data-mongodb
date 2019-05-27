package com.example.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="user")
public class User {
    private String id;
    private String name;
    private String sex;
    private Integer age;
}
