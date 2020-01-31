package com.example.hellospringboot.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Package: com.example.hellospringboot.entity
 * DESCRIPTION:
 *
 * @author guxiu2008
 * @create 2020-01-27 9:56
 **/
@Component
public class User {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private int age;
}
