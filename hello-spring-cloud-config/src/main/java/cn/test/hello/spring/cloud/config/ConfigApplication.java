package cn.test.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 分布式配置中心
 * 在分布式系统中，由于服务数量巨多，为了方便服务配置文件统一管理，实时更新，
 * 所以需要分布式配置中心组件。在 Spring Cloud 中，有分布式配置中心组件 Spring Cloud Config ，
 * 它支持配置服务放在配置服务的内存中（即本地），也支持放在远程 Git 仓库中。
 * 在 Spring Cloud Config 组件中，分两个角色，一是 Config Server，二是 Config Client。
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
