package com.cloud.backend.hhcf.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.backend.hhcf.service.FeignSchedualService;

/**
 * 
 * @ClassName: FeignSchedualController
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69808079
 * @author: zhaotf
 * @date: 2017年10月6日 上午7:26:51
 */
@RestController
@RequestMapping("/feignSchedual")
public class FeignSchedualController {
	private static Logger logger = Logger
			.getLogger(FeignSchedualController.class);
	@Resource
	private FeignSchedualService feignSchedualService;

	/**
	 * @see http://127.0.0.1:8765/feignSchedual/sendFeignMsg.do
	 */
	@RequestMapping("/sendFeignMsg")
	public Object sendFeignMsg(String uName) {
		String rslt = feignSchedualService.sayHiFromClientOne(uName);
		logger.info("feign学习aa:" + uName + "," + rslt);
		return new Date().toString();
	}

	/**
	 * @see http://127.0.0.1:8765/feignSchedual/getConfig.do
	 */
	@RequestMapping("/getConfig")
	public Object getConfig() {
		Object map = this.feignSchedualService.registEurekaService("ztf", 3);
		logger.info("feign学习bb:" + map.toString());
		return map.toString();
	}

}
