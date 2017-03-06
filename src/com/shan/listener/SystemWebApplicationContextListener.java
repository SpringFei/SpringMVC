package com.shan.listener;

import com.shan.interceptor.SystemHandleInterceptor;
import com.shan.util.CommonConst;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Shan on 2017/2/19.
 */
public class SystemWebApplicationContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("********** Context Init ***********");
        CommonConst.WEB_APP_CONTEXT = WebApplicationContextUtils.getWebApplicationContext(servletContextEvent.getServletContext());
      //  System.out.println("CommonConst.WEB_APP_CONTEXT.getId() :"+CommonConst.WEB_APP_CONTEXT.getId());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("********* Context Destroy **********");
    }
}
