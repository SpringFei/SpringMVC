package com.shan.controller.system;

import com.shan.controller.base.BaseController;
import com.shan.service.system.UserManager;
import com.shan.util.PageData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017-03-06.
 */
@Controller
public class UserController extends BaseController {


    @Resource(name="userService")
    private UserManager userService;

    @RequestMapping(value="/userList",method = RequestMethod.GET)
    public String userManage(Model model){
        logger.debug("User Manager Show UserList :");
        PageData pd = this.getPageData();

        try {
            List<PageData> userList = userService.getUserList(pd);
            model.addAttribute("userList",userList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "/system/userList";
    }

}
