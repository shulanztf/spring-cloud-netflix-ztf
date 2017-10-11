package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * @ClassName: ServiceTurbineApplication
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70233227
 * @author: zhaotf
 * @date: 2017年10月11日 下午8:17:32
 */
@SpringBootApplication
@EnableTurbine
public class ServiceTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTurbineApplication.class, args);
	}

}
