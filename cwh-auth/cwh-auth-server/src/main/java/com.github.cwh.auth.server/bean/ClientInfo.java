package com.github.cwh.auth.server.bean;

import com.github.cwh.auth.common.util.jwt.IJWTInfo;
import lombok.Data;

/**
 * @author cwh
 */
@Data
public class ClientInfo implements IJWTInfo {
    String id;
    String clientId;
    String name;

    public ClientInfo(String clientId, String name, String id) {
        this.clientId = clientId;
        this.name = name;
        this.id = id;
    }

    @Override
    public String getUniqueName() {
        return clientId;
    }
}
