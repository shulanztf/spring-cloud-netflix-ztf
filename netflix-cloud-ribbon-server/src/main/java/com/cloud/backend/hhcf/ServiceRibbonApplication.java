package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName: ServiceRibbonApplication
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69788938
 * @author: zhaotf
 * @date: 2017年10月3日 下午8:00:48
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ServiceRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getTestTemplate() {
		return new RestTemplate();
	}

}
