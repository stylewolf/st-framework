package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.framework.core.utils.SimpleData;
import org.st.framework.entity.system.SUser;
import org.st.framework.rest.exception.UserNotFoundException;
import org.st.framework.service.system.user.UserServiceImp;
import org.st.framework.utils.SuccessData;
import org.st.framework.vo.system.SUserVo;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserServiceImp userServiceImp;

    @RequestMapping("/info/{userId}")
    public SimpleData<SUserVo> info(@PathVariable("userId") String userId){
        SUser user = userServiceImp.findById(userId);
        if(user == null){
            throw new UserNotFoundException("未找到编号为["+userId+"]的用户！");
        }
        SuccessData<SUserVo> result = new SuccessData<SUserVo>();
        SUserVo userVo = new SUserVo();
        BeanUtils.copyProperties(user,userVo);
        result.setData(userVo);
        return result;
    }
}
