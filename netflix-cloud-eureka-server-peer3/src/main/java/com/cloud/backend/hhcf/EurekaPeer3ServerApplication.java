package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @ClassName: EurekaPeer3ServerApplication
 * @Description:
 * @see http://blog.csdn.net/pangpengshuai/article/details/58606390
 * @author: zhaotf
 * @date: 2017年10月7日 下午4:23:03
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaPeer3ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaPeer3ServerApplication.class, args);
	}

}
