package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @ClassName: EurekaBackupServerApplication
 * @Description:
 * @see http://www.ccblog.cn/95.htm
 * @see http://blog.csdn.net/forezp/article/details/70183572
 * @author: zhaotf
 * @date: 2017年10月7日 下午3:22:04
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBackupServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaBackupServerApplication.class, args);
	}

}
