package org.st.framework.service.system.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.st.framework.entity.system.SModule;

import java.util.List;
@Service
@Transactional
public class ModuleServiceImp implements IModuleService {

    @Autowired
    private ModuleRepository moduleRepository;
    @Autowired
    private RoleModuleRepository roleModuleRepository;

    @Override
    public List<SModule> findModulesOfRole(String roleId) {
        return moduleRepository.findModulesOfRole(roleId);
    }

    @Override
    public List<SModule> findModulesOfUser(String userId) {
        return moduleRepository.findModulesOfUser(userId);
    }
}
