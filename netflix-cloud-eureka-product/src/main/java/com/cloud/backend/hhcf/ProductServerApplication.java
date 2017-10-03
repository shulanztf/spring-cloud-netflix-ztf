package com.cloud.backend.hhcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 
 * @ClassName: ProductServerApplication
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69696915
 * @author: zhaotf
 * @date: 2017年10月3日 下午5:31:54
 */
@EnableEurekaClient
@SpringBootApplication
public class ProductServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServerApplication.class, args);
	}

}
