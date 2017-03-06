package com.shan.service.system.impl;

import com.shan.dao.DaoSupport;
import com.shan.service.system.UserManager;
import com.shan.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-03-06.
 */
@Service("userService")
public class UserService implements UserManager {

    @Resource(name = "daoSupport")
    private DaoSupport dao;

    @Override
    public List<PageData> getUserList(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("UserMapper.getUserList", pd);
    }
}
