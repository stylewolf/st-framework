package org.st.framework.service.system.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.st.framework.entity.system.SRole;

import java.util.List;
@Repository
public interface RoleRepository extends JpaRepository<SRole,String>,JpaSpecificationExecutor<SRole> {
    @Query(value="select r from org.st.framework.entity.system.SRole r where " +
                    "exists (select ur.id.roleId from org.st.framework.entity.system.SUserRole ur " +
                        "where r.id = ur.id.roleId and ur.id.userId=?1) order by name")
    List<SRole> findUserRoles(String userId);
}
