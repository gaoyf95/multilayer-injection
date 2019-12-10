package com.gaoyf.multilayerinjection.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by 高宇飞 on 2019/12/10 15:19:55
 */
@Data
@NoArgsConstructor
public class Teacher {
    private int id;
    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
