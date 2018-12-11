package org.st.framework.service.system.role;

import org.springframework.data.domain.Page;
import org.st.framework.entity.system.SRole;
import org.st.framework.vo.system.SRoleVo;

import java.util.List;

public interface IRoleService {
    SRole findById(String id);

    void save(SRole role);

    void update(SRole role);

    Page<SRole> page(Integer page, Integer size, SRoleVo roleVo);

    public List<SRole> findUserRoles(String userId);
}
