package org.xuenan.ctxregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CtxRegisterApplication {


    public static void main(String[] args) {
        SpringApplication.run(CtxRegisterApplication.class, args);
    }

}
