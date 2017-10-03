package com.cloud.backend.hhcf.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

	/**
	 * @see /eurekaProduct/registEurekaService.do
	 */
	@ResponseBody
	@RequestMapping("/registEurekaService")
	public Object registEurekaService() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("time", new Date());
		map.put("aaa", "zhaotfaaa");
		return map;
	}

}
