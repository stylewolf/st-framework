package org.st.framework.service.system.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.st.framework.entity.system.SRoleModule;
import org.st.framework.entity.system.SRoleModulePK;
@Repository
public interface RoleModuleRepository  extends JpaRepository<SRoleModule,SRoleModulePK> {
}
