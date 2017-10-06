package com.cloud.backend.hhcf.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cloud.backend.hhcf.model.HmMoneyMgModel;
import com.cloud.backend.hhcf.model.HmUserMgModel;

/**
 * 
 * @ClassName: FeignSchedualService
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69808079
 * @author: zhaotf
 * @date: 2017年10月6日 上午7:23:17
 */
@FeignClient(value = "hmlcserver")
public interface FeignSchedualService {

	/**
	 * @see
	 */
	@RequestMapping(value = "/getHello")
	public String sayHiFromClientOne(@RequestParam(value = "uName") String uName);

	@RequestMapping(value = "/eurekaProduct/registEurekaService")
	public Map<String, Object> registEurekaService(
			@RequestParam(value = "userName") String userName,
			@RequestParam(value = "age") Integer age);

	/**
	 * 对象参数测试
	 */
	@RequestMapping(value = "/eurekaProduct/saveSaveOrderInfo")
	public HmMoneyMgModel saveSaveOrderInfo(
			@RequestParam(value = "userMg") HmUserMgModel userInfo);

}
