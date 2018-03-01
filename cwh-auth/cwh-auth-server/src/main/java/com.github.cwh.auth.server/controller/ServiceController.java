package com.github.cwh.auth.server.controller;

import com.github.cwh.auth.server.biz.ClientBiz;
import com.github.cwh.auth.server.entity.Client;
import com.github.cwh.auth.server.entity.ClientService;
import com.github.cwh.common.msg.ObjectRestResponse;
import com.github.cwh.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz, Client> {

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients) {
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id) {
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
