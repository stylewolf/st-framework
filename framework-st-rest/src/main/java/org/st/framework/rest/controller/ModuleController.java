package org.st.framework.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.st.framework.core.utils.SimpleData;
import org.st.framework.entity.system.SModule;
import org.st.framework.service.system.module.ModuleServiceImp;
import org.st.framework.utils.SuccessData;

import java.util.List;

@RestController
@RequestMapping("/module")
public class ModuleController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ModuleController.class);
    @Autowired
    private ModuleServiceImp moduleServiceImp;

    @RequestMapping("/of/user/{userId}")
    public SimpleData<List<SModule>> modulesOfUser(@PathVariable("userId") String userId){
        SuccessData<List<SModule>> result = new SuccessData<List<SModule>>();
        List<SModule> data = moduleServiceImp.findModulesOfUser(userId);
        result.setData(data);
        return result;
    }

    @RequestMapping("/of/role/{roleId}")
    public SimpleData<List<SModule>> modulesOfRole(@PathVariable("roleId") String roleId){
        SuccessData<List<SModule>> result = new SuccessData<List<SModule>>();
        List<SModule> data = moduleServiceImp.findModulesOfRole(roleId);
        result.setData(data);
        return result;
    }
}
