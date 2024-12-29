package net.xdclass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @authordell
 * @date2024/12/1022:21
 * @param${PARAM}
 */
@SpringBootApplication
@MapperScan("net.xdclass.mapper")
@EnableDiscoveryClient
@EnableCircuitBreaker
public class VideoApplication {
    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class,args);
    }
}
