package com.shan.service.test;

import com.shan.po.Page;
import com.shan.util.PageData;

import java.util.List;

/**
 * Created by Shan on 2017/2/23.
 */
public interface TestManager {

    public List<PageData> getTestList(PageData pd) throws  Exception;
}
