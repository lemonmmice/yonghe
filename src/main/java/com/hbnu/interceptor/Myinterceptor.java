package com.hbnu.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @author
 * @date
 */
public class Myinterceptor implements HandlerInterceptor {



    /**
     * 方法将在请求处理之前进行调用，该方法的返回值是布尔值Boolean类型的
     * 当它返回为false 时，表示请求结束，后续的Interceptor 和Controller 都不会再执行,因此最重要,经常使用
     * 返回false时我们可以通过重定向或者转发到其他资源,避开被拦截的资源
     * 当返回值为true 时就会继续调用下一个Interceptor 的preHandle 方法
     * @param request
     * @param response
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //当用户输入错误的日期格式时，拦截请求
        String orderTime = request.getParameter("orderTime");
        String a="[a-cx-z]";
        if (orderTime.contains(a)){
            return  false;
        }
        else {
            return true;
        }

    }

    /**
     * 该方法是在当前请求进行处理之后被调用,即它会在DispatcherServlet 进行视图返回渲染之前被调用
     * 前提是preHandle 方法的返回值为true 时才能被调用
     * 所以我们可以在这个方法中对Controller 处理之后的ModelAndView 对象进行操作
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 该方法将在整个请求结束之后,也就是在DispatcherServlet 渲染了对应的视图之后执行
     * 前提是preHandle 方法的返回值为true 时才能被调用
     * 这个方法提供了Exception参数,可以对异常进行一些处理
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
