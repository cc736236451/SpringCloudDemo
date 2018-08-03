package com.eureka.eurekazuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class MyFilter extends ZuulFilter {

    /**
     * 过滤器类型
     * pre 调用前
     * routing 调用中
     * post 调用后
     * error 错误过滤器
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器执行顺序
     * 数值越大越靠后
     * @return
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     * 是否应用该过滤器
     * true 应用
     * false 不应用
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器逻辑
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        return null;
    }
}
