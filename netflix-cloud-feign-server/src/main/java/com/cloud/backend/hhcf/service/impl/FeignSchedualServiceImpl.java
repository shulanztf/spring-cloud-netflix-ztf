package com.cloud.backend.hhcf.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.cloud.backend.hhcf.model.HmMoneyMgModel;
import com.cloud.backend.hhcf.model.HmUserMgModel;
import com.cloud.backend.hhcf.service.FeignSchedualService;

/**
 * 
 * @ClassName: FeignSchedualServiceImpl
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69934399
 * @author: zhaotf
 * @date: 2017年10月6日 下午5:09:11
 */
@Component
public class FeignSchedualServiceImpl implements FeignSchedualService {

	@Override
	public String sayHiFromClientOne(String uName) {
		return "远程服务无法使用";
	}

	@Override
	public Map<String, Object> registEurekaService(String userName, Integer age) {
		return new HashMap<String, Object>();
	}

	@Override
	public HmMoneyMgModel saveSaveOrderInfo(HmUserMgModel userInfo) {
		return new HmMoneyMgModel();
	}

}
