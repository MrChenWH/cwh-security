package com.github.cwh.auth.server.mapper;

import com.github.cwh.auth.server.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author cwh
 */
public interface ClientServiceMapper extends Mapper<ClientService> {

    void deleteByServiceId(int id);
}
