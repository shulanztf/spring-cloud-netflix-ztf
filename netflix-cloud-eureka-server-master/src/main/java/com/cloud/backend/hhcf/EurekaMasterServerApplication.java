package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @ClassName: EurekaMasterServerApplication
 * @Description:
 * @see http://www.ccblog.cn/95.htm
 * @see http://blog.csdn.net/forezp/article/details/70183572
 * @author: zhaotf
 * @date: 2017年10月7日 下午3:19:53
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMasterServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMasterServerApplication.class, args);
	}

}
