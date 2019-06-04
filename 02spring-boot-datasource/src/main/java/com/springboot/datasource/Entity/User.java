package com.springboot.datasource.Entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.Data;
import lombok.Setter;

/**
 * @description: spring-boot-examples
 **/

@Data
public class User {
    private String id;
    private String name;
    private String age;
}
