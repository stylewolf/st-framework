package org.st.framework.service.system.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import org.st.framework.entity.system.SUser;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<SUser,String> ,JpaSpecificationExecutor<SUser> {
    Optional<SUser> findById(String id);

    Optional<SUser> findByLoginId(String id);
}
