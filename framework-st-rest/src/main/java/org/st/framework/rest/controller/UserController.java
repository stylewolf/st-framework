package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.session.hazelcast.HazelcastSessionRepository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.framework.core.utils.SimpleData;
import org.st.framework.entity.system.SUser;
import org.st.framework.rest.exception.PasswordIncorrectException;
import org.st.framework.rest.exception.UserNotFoundException;
import org.st.framework.service.system.user.UserServiceImp;
import org.st.framework.utils.EncryptionUtil;
import org.st.framework.utils.SuccessData;
import org.st.framework.vo.system.SUserVo;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserServiceImp userServiceImp;
    @Value("${app.encryption}")
    private String encryption;

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
        
        session.setAttribute(HazelcastSessionRepository.DEFAULT_SESSION_MAP_NAME,userVo);
        return result;
    }

    /**
     * 登录
     * @param loginId
     * @param password
     * @param kaptcha
     * @return
     */
    @RequestMapping("/login")
    public SimpleData<SUserVo> login( String loginId,
                                       String password,
                                       String kaptcha){

        SUser user = userServiceImp.findByLoginId(loginId);
        if(user == null){
            throw new UserNotFoundException("未找到登录名为["+loginId+"]的用户！");
        }
        //获取保存的密码
        String savePassword = EncryptionUtil.encryption(user.getId(),password,encryption);
        if(!savePassword.equals(user.getPassword())){
            throw new PasswordIncorrectException("密码不正确！");
        }
        SuccessData<SUserVo> result = new SuccessData<SUserVo>();
        SUserVo userVo = new SUserVo();
        BeanUtils.copyProperties(user,userVo);
        userVo.setPassword("******");
        result.setData(userVo);

        return result;
    }
}
