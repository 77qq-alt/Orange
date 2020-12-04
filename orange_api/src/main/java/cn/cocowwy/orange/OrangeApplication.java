package cn.cocowwy.orange;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan(basePackages = {"cn.cocowwy.orange.mapper"})// 扫描mapper所在位置
@EnableCaching  // 开启缓存功能
@EnableDiscoveryClient
public class OrangeApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrangeApplication.class, args);
    }
}
