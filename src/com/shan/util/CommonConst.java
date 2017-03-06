package com.shan.util;

import org.springframework.context.ApplicationContext;

/**
 * Created by Shan on 2017/2/19.
 */
public class CommonConst {
    public static final String SESSION_SECURITY_CODE = "sessionSecCode";//验证码
    public static final String SESSION_USER = "sessionUser";			//session用的用户

    public static final String PAGE	= "10";			//分页条数配置路径

    public static final String NO_INTERCEPTOR_PATH = ".*/((login)|(test)|(getQueryInfo)|(logout)|(code)|(app)|(static)|(main)).*";	//不对匹配该值的访问路径拦截（正则）

    public static ApplicationContext WEB_APP_CONTEXT = null;
}
