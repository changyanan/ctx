package org.xuenan.ctxmonitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class CtxMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtxMonitorApplication.class, args);
	}

}
