package com.begin.springboot2.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : xujunbao
 * @ClassName com.begin.springboot2.entity
 * @description
 * @Create Date : 2023/1/29
 */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private String age;
}
