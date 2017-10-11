package com.cloud.backend.hhcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 
 * @ClassName: EurekaServer1Controller
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/70217283
 * @author: zhaotf
 * @date: 2017年10月11日 下午8:43:32
 */
@RestController
@RequestMapping("/eurekaServer1")
public class EurekaServer1Controller {
	
	@RequestMapping("/hi")
	@HystrixCommand(fallbackMethod = "hiError")
	public String home(@RequestParam String name) {
		return "hi "+name+",i  am lucy and from port:" +123;
	}

	public String hiError(String name) {
		return "hi,"+name+",sorry,error!";
	}
	
}
