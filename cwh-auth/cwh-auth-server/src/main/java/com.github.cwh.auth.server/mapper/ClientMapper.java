package com.github.cwh.auth.server.mapper;

import com.github.cwh.auth.server.entity.Client;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author cwh
 */
public interface ClientMapper extends Mapper<Client> {

    List<String> selectAllowedClient(String serviceId);

    List<Client> selectAuthorityServiceInfo(int clientId);
}
