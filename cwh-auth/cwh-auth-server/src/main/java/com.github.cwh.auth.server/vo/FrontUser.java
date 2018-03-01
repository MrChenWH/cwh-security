package com.github.cwh.auth.server.vo;

import com.github.cwh.api.vo.authority.PermissionInfo;
import lombok.Data;

import java.util.List;

/**
 * @author cwh
 */
@Data
public class FrontUser {
    public String id;
    public String username;
    public String name;
    private String description;
    private String image;
    private List<PermissionInfo> menus;
    private List<PermissionInfo> elements;
}
