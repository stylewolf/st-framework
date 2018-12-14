package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.framework.entity.system.SRole;
import org.st.framework.service.system.role.RoleServiceImp;
import org.st.framework.utils.SuccessData;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController extends BaseController{
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
    @Autowired
    private RoleServiceImp roleServiceImp;
    @RequestMapping("/of/{userId}")
    public SuccessData<List<SRole>> userRoles(@PathVariable("userId") String userId){
        List<SRole> roles = roleServiceImp.findUserRoles(userId);
        SuccessData<List<SRole>> rs = new SuccessData<List<SRole>>();
        rs.setData(roles);
        return rs;
    }
}
