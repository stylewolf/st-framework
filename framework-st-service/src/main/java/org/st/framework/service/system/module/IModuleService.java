package org.st.framework.service.system.module;

import org.st.framework.entity.system.SModule;

import java.util.List;

public interface IModuleService {

    List<SModule> findModulesOfRole(String roleId);

    List<SModule> findModulesOfUser(String userId);

}
