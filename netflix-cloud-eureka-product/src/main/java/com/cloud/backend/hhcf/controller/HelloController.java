package com.cloud.backend.hhcf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: HelloController
 * @Description:
 * @author: zhaotf
 * @date: 2017年10月4日 上午7:50:55
 */
@RestController
public class HelloController {

	@RequestMapping("/getHello")
	public String getHello(String uname) {
		System.out.println("cccc:" + uname);
		return "axoewwwwwwwwwwwwwwwwwwwww";
	}

}
