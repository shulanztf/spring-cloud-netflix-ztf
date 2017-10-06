package com.cloud.backend.hhcf.service;

import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;
import com.cloud.backend.hhcf.model.HmMoneyMgModel;
import com.cloud.backend.hhcf.model.HmUserMgModel;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 
 * @ClassName: RibbonService
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69788938
 * @see http://blog.csdn.net/forezp/article/details/69934399
 * @author: zhaotf
 * @date: 2017年10月3日 下午8:12:10
 */
@Service
public class RibbonService {
	private static Logger logger = Logger.getLogger(RibbonService.class);
	@Resource
	private RestTemplate restTemplate;

	/**
	 * 对象参数测试
	 */
	public HmMoneyMgModel saveSaveOrderInfo() {
		HmUserMgModel userInfo = new HmUserMgModel();
		userInfo.setAge(243);
		userInfo.setUserName("zs中亠cg");
		userInfo.setRegisTime(new Date());
		ResponseEntity<HmMoneyMgModel> order = this.restTemplate.postForEntity(
				"http://hmlcserver/eurekaProduct/saveSaveOrderInfo.do",
				userInfo, HmMoneyMgModel.class);
		logger.info("netflix-ribbon对象参数:" + JSON.toJSONString(order.getBody()));
		return order.getBody();
	}

	@HystrixCommand(fallbackMethod = "errorCommod")
	public String hiService(String name) {
		logger.info("ribbon serivce端:" + name);
		String url = restTemplate.getForObject(
				"http://hmlcserver/getHello?uame=" + name, String.class);
		logger.info("ribbon serivce端:" + name + "," + url);
		return url;
	}

	public String errorCommod(String name) {
		return "远程服务不可用:http://hmlcserver/getHello.do";
	}

	public Object getConfig(String name) {
		logger.info("ribbon serivce端:" + name);
		Map old = restTemplate.getForObject(
				"http://hmlcserver/eurekaProduct/registEurekaService.do?userName="
						+ name, Map.class);
		logger.info("ribbon serivce端,AAA:" + name + "," + old.toString());
		return old;
	}

}
