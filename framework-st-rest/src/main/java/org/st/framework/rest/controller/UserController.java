package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.framework.entity.system.SUser;
import org.st.framework.service.system.user.UserServiceImp;
import org.st.framework.vo.system.SUserVo;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserServiceImp userServiceImp;

    @RequestMapping("/info")
    public SUserVo info(){
        SUser user = userServiceImp.findById("admin");
        Page<SUser> users =  userServiceImp.page(0,10,null);
        for (SUser sUser : users) {
            System.out.println(sUser.getUserName());
        }
        return null;
    }
}
