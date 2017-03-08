package com.shan.controller.system;

import com.shan.controller.base.BaseController;
import com.shan.service.system.UserManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017-03-07.
 */
@Controller
public class MainController extends BaseController {
    @Resource(name="userService")
    private UserManager userService;

    @RequestMapping(value = "/welcome",method = RequestMethod.GET)
    public String showWelcome(Model model){
        logger.debug("welcome test!xxxxx");
        model.addAttribute("msg","success");
        return "/system/welcome";
    }

}
