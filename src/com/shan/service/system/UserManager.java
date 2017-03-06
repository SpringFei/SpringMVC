package com.shan.service.system;

import com.shan.util.PageData;

import java.util.List;

/**
 * Created by Administrator on 2017-03-06.
 */
public interface UserManager {


    /**
     * 查询用户列表
     * @param pd
     * @return
     * @throws Exception
     */
    public List<PageData> getUserList(PageData pd) throws  Exception;


}
