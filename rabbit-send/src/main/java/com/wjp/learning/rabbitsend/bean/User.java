package com.wjp.learning.rabbitsend.bean;


import lombok.Data;

import java.io.Serializable;

/**
 * @Author: wangjiaping
 * @Date: 2019-09-09 14:48
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -5842387460391012785L;

    private Integer id;

    private String name;

    private Integer age;
}
