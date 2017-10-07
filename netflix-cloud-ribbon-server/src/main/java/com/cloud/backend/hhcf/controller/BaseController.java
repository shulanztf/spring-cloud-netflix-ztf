package com.cloud.backend.hhcf.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName: BaseController
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69939114
 * @author: zhaotf
 * @date: 2017年10月7日 上午9:01:14
 */
@RestController
@RequestMapping("/base")
public class BaseController {
	private static Logger logger = Logger.getLogger(BaseController.class);

	@RequestMapping("/getZuulMsg")
	public String getZuulMsg() {
		return "ribbon来源";
	}

}
