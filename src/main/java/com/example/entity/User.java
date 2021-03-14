package com.example.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * @auther lenovo
 * @date 2021/3/4 14:00
 */
@Data
@Repository
@ConfigurationProperties(prefix = "usr")
public class User {
    String userName;
}
