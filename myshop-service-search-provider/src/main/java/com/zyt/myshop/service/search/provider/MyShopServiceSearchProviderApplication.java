package com.zyt.myshop.service.search.provider;

import com.alibaba.dubbo.container.Main;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = "com.zyt.myshop")
@EnableHystrix
@EnableHystrixDashboard
@MapperScan(basePackages = "com.zyt.myshop.service.search.provider.mapper")
public class MyShopServiceSearchProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run (MyShopServiceSearchProviderApplication.class, args);
        Main.main (args);
    }
}
