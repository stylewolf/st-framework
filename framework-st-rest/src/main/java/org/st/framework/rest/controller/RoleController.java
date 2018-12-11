package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.framework.entity.system.SRole;
import org.st.framework.service.system.role.RoleServiceImp;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);
    @Autowired
    private RoleServiceImp roleServiceImp;
    @RequestMapping("/of/{userId}")
    public List<SRole> userRoles(@PathVariable("userId") String userId){
        return  roleServiceImp.findUserRoles(userId);
    }
}
