package kr.co.springcloudserivce1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudSevice1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudSevice1Application.class, args);
    }

}
