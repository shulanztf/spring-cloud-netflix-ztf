package com.cloud.backend.hhcf.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @ClassName: EurekaProductController
 * @Description:
 * @author: zhaotf
 * @date: 2017年10月3日 下午5:33:10
 */
@Controller
@RequestMapping("/eurekaProduct")
public class EurekaProductController {
	private static Logger logger = Logger
			.getLogger(EurekaProductController.class);
	@Value("${server.port}")
	private String port;

	/**
	 * @see http://127.0.0.1:8762/eurekaProduct/registEurekaService.do
	 */
	@ResponseBody
	@RequestMapping(value = "/registEurekaService")
	public Object registEurekaService(String userName, Integer age) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("time", new Date());
		map.put("aaa", "zhaotfaaa");
		map.put("port", port);
		logger.info("eureka生产端:" + port + "," + userName + "," + age + ","
				+ map.toString());
		return map;
	}

}
