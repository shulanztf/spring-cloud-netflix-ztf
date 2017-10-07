package com.cloud.backend.hhcf.filter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * 
 * @ClassName: RoleFilter
 * @Description:
 * @see http://blog.csdn.net/forezp/article/details/69939114
 * @author: zhaotf
 * @date: 2017年10月7日 上午9:17:33
 */
@Component
public class RoleFilter extends ZuulFilter {
	private static Logger logger = Logger.getLogger(RoleFilter.class);

	@Override
	public Object run() {
		RequestContext rc = RequestContext.getCurrentContext();
		HttpServletRequest request = rc.getRequest();
		logger.info("zuul-filter权限校验:" + request.getMethod() + ","
				+ request.getRequestURL().toString());
		String token = request.getParameter("token");
		Map<String, String[]> map = request.getParameterMap();
		logger.info("zuul-filter权限校验aa:"+JSON.toJSONString(map));
		
		if (StringUtils.isBlank(token)) {
			logger.warn("token不能为空");
			rc.setSendZuulResponse(false);
			rc.setResponseStatusCode(401);
			try {
				rc.getResponse().getWriter().write("token不能为空");
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("zuul权限校验异常", e);
			}
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	/**
	 * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下： pre：路由之前
	 * routing：路由之时 post： 路由之后 error：发送错误调用 filterOrder：过滤的顺序
	 * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
	 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
	 */
	@Override
	public String filterType() {
		return "pre";
	}

}
