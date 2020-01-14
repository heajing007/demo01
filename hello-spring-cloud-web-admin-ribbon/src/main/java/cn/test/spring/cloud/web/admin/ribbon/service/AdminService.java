package cn.test.spring.cloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")//回调方法 出问题了,就返回hiError
    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message=" + message, String.class);
    }

    public String hiError(String message){
        return String.format("Hi your message is %s, But request fail", message);
    }
}
