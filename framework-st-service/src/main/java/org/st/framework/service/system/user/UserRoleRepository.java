package org.st.framework.service.system.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.st.framework.entity.system.SUserRole;
import org.st.framework.entity.system.SUserRolePK;
@Repository
public interface UserRoleRepository extends JpaRepository<SUserRole,SUserRolePK> {
}
