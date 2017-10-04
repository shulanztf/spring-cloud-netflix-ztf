package com.cloud.backend.hhcf.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.backend.hhcf.service.RibbonService;

/**
 * 
 * @ClassName: RibbonServerController
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69788938
 * @author: zhaotf
 * @date: 2017年10月3日 下午8:03:25
 */
@Controller
@RequestMapping("/ribbonServer")
public class RibbonServerController {
	private Logger logger = Logger.getLogger(RibbonServerController.class);

	@Resource
	private RibbonService ribbonService;

	/**
	 * @see /ribbonServer/findRetomeServer.do
	 * @return Object
	 * @throws
	 */
	@RequestMapping("/findRetomeServer")
	public String findRetomeServer(String name) {
		logger.info("ribbon测试:" + name);
		return ribbonService.hiService(name);
	}

}
