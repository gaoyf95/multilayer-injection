package com.gaoyf.multilayerinjection.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 高宇飞 on 2019/12/10 15:06:26
 */
@Data
@NoArgsConstructor
public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
