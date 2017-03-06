package com.shan.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shan.util.CommonConst;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Created by Shan on 2017/2/18.
 */
public class SystemHandleInterceptor extends HandlerInterceptorAdapter {
    private org.apache.log4j.Logger logger = Logger.getLogger(Log.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        logger.debug("PATH :"+path);
        if(path.matches(CommonConst.NO_INTERCEPTOR_PATH) ){  //|| (path.equals("/s")) || (path.equals("/gencode/verify.do"))
            return true;
        }else{
            System.out.println("No interceptor !!!!!!");
            // 权限判断
           /*
            User user = (User)Jurisdiction.getSession().getAttribute(CommonConst.SESSION_USER);
            if(user!=null){
                System.out.println("path :"+path);
                path = path.substring(1, path.length());
                boolean b = Jurisdiction.hasJurisdiction(path); //访问权限校验
                if(!b){
                    response.sendRedirect(request.getContextPath() + Const.LOGIN);
                }

                System.out.println("xx :"+request.getContextPath() + Const.LOGIN);
                return b;
            }else{
                //登陆过滤
                response.sendRedirect(request.getContextPath() + Const.LOGIN);
                return false;
            }
            */
           return true;
        }
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("post Handle !!!");
    }
}
