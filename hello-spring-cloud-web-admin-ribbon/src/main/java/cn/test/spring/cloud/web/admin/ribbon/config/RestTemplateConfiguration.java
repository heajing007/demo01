package cn.test.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//负载均衡配置
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced//启动负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
