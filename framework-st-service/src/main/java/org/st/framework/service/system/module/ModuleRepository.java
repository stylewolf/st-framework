package org.st.framework.service.system.module;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.st.framework.entity.system.SModule;

import java.util.List;

@Repository
public interface ModuleRepository extends JpaRepository<SModule,String> {

    @Query(value="select module from org.st.framework.entity.system.SModule module where " +
                    "exists (select rm.id.roleId from org.st.framework.entity.system.SRoleModule rm " +
                        "where rm.id.moduleId=module.id and rm.id.roleId=?1) order by layer")
    List<SModule> findModulesOfRole(String roleId);

    @Query(value="select module from org.st.framework.entity.system.SModule module where " +
            "exists (select rm.id.roleId from org.st.framework.entity.system.SRoleModule rm " +
                "where exists (select ur.id.userId from org.st.framework.entity.system.SUserRole ur " +
                                    "where ur.id.roleId=rm.id.roleId and ur.id.userId=?1) " +
                    "and rm.id.moduleId=module.id) order by layer")
    List<SModule> findModulesOfUser(String userId);
}
