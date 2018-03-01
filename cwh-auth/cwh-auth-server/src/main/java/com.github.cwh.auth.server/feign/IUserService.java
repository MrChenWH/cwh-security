package com.github.cwh.auth.server.feign;

import com.github.cwh.api.vo.user.UserInfo;
import com.github.cwh.auth.server.configuration.FeignConfiguration;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cwh
 */
@FeignClient(value = "ace-admin", configuration = FeignConfiguration.class)
public interface IUserService {
    /**
     * 用户权限认证
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/api/user/validate", method = RequestMethod.POST)
    UserInfo validate(@RequestParam("username") String username, @RequestParam("password") String password);
}
