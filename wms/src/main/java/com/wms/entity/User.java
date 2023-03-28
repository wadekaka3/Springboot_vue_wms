package com.wms.entity;

import lombok.Data;

/**
 * @author Brian
 * @version 1.0
 */
@Data
public class User {
    private int id;
    private String no;
    private String name;
    private String password;
    private int sex;
    private int roleId;
    private String phone;
    private String isvalid;
}
