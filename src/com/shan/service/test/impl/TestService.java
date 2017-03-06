package com.shan.service.test.impl;

import com.shan.dao.DaoSupport;
import com.shan.po.Page;
import com.shan.service.test.TestManager;
import com.shan.util.PageData;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

    /**
     * Created by Shan on 2017/2/23.
     */
    @Service("testService")
    public class TestService implements TestManager {

    @Resource(name = "daoSupport")
    private DaoSupport dao;
    @Override
    public List<PageData> getTestList(PageData pd) throws Exception {
        return (List<PageData>) dao.findForList("TestMapper.getTestList", pd);
    }
}
