package com.github.cwh.api.vo.authority;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cwh
 */
@Data
public class PermissionInfo implements Serializable {
    private String code;
    private String type;
    private String uri;
    private String method;
    private String name;
    private String menu;
}
