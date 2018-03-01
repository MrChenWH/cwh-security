package com.github.cwh.api.vo.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cwh
 */
@Data
public class UserInfo implements Serializable {
    public String id;
    public String username;
    public String password;
    public String name;
    private String description;
}
