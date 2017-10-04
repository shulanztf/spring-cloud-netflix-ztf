package com.cloud.backend.hhcf.service;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @ClassName: RibbonService
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69788938
 * @author: zhaotf
 * @date: 2017年10月3日 下午8:12:10
 */
@Service
public class RibbonService {
	private static Logger logger = Logger.getLogger(RibbonService.class);
	@Resource
	private RestTemplate restTemplate;

	public String hiService(String name) {
		logger.info("ribbon serivce端:" + name);
		Map old =  restTemplate.getForObject(
				 "http://hmlcserver/eurekaProduct/registEurekaService.do?userName="
				 + name, Map.class);
		logger.info("ribbon serivce端,AAA:" + name + "," + old.toString());
		
		String url = restTemplate.getForObject(
				"http://hmlcserver/getHello?uame=" + name, String.class);
		logger.info("ribbon serivce端:" + name + "," + url);
		return url;
	}

}
