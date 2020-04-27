package cn.bdqn.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("cn.bdqn.provider.mapper")
@EnableDiscoveryClient
public class BdqnServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BdqnServiceProviderApplication.class, args);
    }

}
