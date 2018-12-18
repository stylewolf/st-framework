package org.st.framework.service.system.user;

import org.springframework.data.domain.Page;
import org.st.framework.entity.system.SUser;
import org.st.framework.vo.system.SUserVo;

public interface IUserService {

    SUser findById(String id);

    SUser findByLoginId(String loginId);

    void save(SUser user);

    void update(SUser user);

    Page<SUser> page(Integer page, Integer size, SUserVo userVo);

}
