package org.st.framework.service.system.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.st.framework.entity.system.SRole;
import org.st.framework.service.system.user.UserRoleRepository;
import org.st.framework.vo.system.SRoleVo;

import java.util.List;

@Transactional
@Service
public class RoleServiceImp implements IRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public SRole findById(String id) {
        return null;
    }

    @Override
    public void save(SRole role) {

    }

    @Override
    public void update(SRole role) {

    }

    @Override
    public Page<SRole> page(Integer page, Integer size, SRoleVo roleVo) {
        return null;
    }

    @Override
    public List<SRole> findUserRoles(String userId) {
        return roleRepository.findUserRoles(userId);
    }
}
