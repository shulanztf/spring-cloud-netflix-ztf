package com.cloud.backend.hhcf.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cloud.backend.hhcf.model.HmMoneyMgModel;
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
	 * netflix-ribbot对象参数测试
	 * 
	 * @see http://127.0.0.1:8764/ribbonServer/saveSaveOrderInfo.do
	 */
	@ResponseBody
	@RequestMapping("/saveSaveOrderInfo")
	public Object saveSaveOrderInfo() {
		HmMoneyMgModel order = this.ribbonService.saveSaveOrderInfo();
		logger.info("netflix-ribbot学习,对象参数测试:" + JSON.toJSONString(order));
		return order;
	}

	/**
	 * @see http://127.0.0.1:8764/ribbonServer/findRetomeServer.do
	 * @return Object
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/findRetomeServer")
	public String findRetomeServer(String name) {
		logger.info("ribbon测试:" + name);
		return "ribbon:" + ribbonService.hiService(name);
	}

	/**
	 * @see http://127.0.0.1:8764/ribbonServer/getConfig.do
	 */
	@ResponseBody
	@RequestMapping("/getConfig")
	public Object getConfig(String name) {
		logger.info("ribbon测试:" + name);
		return ribbonService.getConfig(name);
	}

}
