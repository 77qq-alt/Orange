package cn.cocowwy.orange;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.config.EnableNacosConfig;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = {"cn.cocowwy.orange.mapper"})// 扫描mapper所在位置
@EnableCaching  // 开启缓存功能
@EnableNacosConfig(globalProperties = @NacosProperties(serverAddr = "xxxxx"))
@NacosPropertySource(dataId = "orange-api-dev", autoRefreshed = true) //Nacos
public class OrangeApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrangeApplication.class, args);
    }
}
