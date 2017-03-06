package com.shan.controller.test;

import com.shan.controller.base.BaseController;
import com.shan.service.test.TestManager;
import com.shan.util.CommonConst;
import com.shan.util.PageData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shan on 2017/2/18.
 */
@Controller
public class TestController extends BaseController{

    @Resource(name="testService")
    private TestManager testService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model){
        logger.debug("测试 ");
        logger.info("APP :"+ CommonConst.WEB_APP_CONTEXT);
        PageData pd = this.getPageData();

        try {
            logger.debug("pageDate :"+pd);
           List list =  testService.getTestList(pd);


            model.addAttribute("msg","Hello World!");
            model.addAttribute("name","test");
            model.addAttribute("pd",list);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "hello";
    }

    @RequestMapping(value = "/gohome",method = RequestMethod.GET)
    public String goHome(Model model){
        model.addAttribute("userName","单飞!");
        //model.addAttribute("name","test");
        return "main";
    }

    @RequestMapping(value = "/testMenu",method = RequestMethod.GET)
    public String testMenu(Model model){
        model.addAttribute("msg","test menu!");
        List<PageData> list = new ArrayList<PageData>();
        PageData pd = this.getPageData();
        pd.put("ID","1");
        pd.put("PARENT_ID","0");
        pd.put("MENU_NAME","SystemManage");
        pd.put("MENU_URL","#");
        pd.put("HAS_SUBMENU","1");
        list.add(pd);

        PageData pd1 = new PageData();
        pd1.put("ID","2");
        pd1.put("PARENT_ID","1");
        pd1.put("MENU_NAME","user manage");
        pd1.put("MENU_URL","/user");
        pd.put("HAS_SUBMENU","0");
        list.add(pd1);

        PageData pd2 = new PageData();
        pd2.put("ID","3");
        pd2.put("PARENT_ID","1");
        pd2.put("MENU_NAME","user list");
        pd2.put("MENU_URL","/userList");
        pd.put("HAS_SUBMENU","0");
        list.add(pd2);


        model.addAttribute("pd",list);
        model.addAttribute("subList",list);
        return  "left";
    }

}
