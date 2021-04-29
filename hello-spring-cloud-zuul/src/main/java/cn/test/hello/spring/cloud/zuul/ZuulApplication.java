package cn.test.hello.spring.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Zuul 的主要功能是路由转发和过滤器。路由功能是微服务的一部分，
 * 比如 /api/user 转发到到 User 服务，/api/shop 转发到到 Shop 服务。
 * Zuul 默认和 Ribbon 结合实现了负载均衡的功能。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
