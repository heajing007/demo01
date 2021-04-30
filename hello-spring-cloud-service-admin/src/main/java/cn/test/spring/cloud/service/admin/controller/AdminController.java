package cn.test.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供者
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    /**
     * sss
     * @param message
     * @return
     */
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(String message){
        return String.format("Hi your message is  %s, port is %s", message, port);
    }
}
