package org.st.framework.service.system.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.st.framework.entity.system.SUser;
import org.st.framework.vo.system.SUserVo;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImp implements IUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImp.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public SUser findById(String id) {
        Optional<SUser> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public void save(SUser user) {

    }

    @Override
    public void update(SUser user) {

    }

    @Override
    public Page<SUser> page(Integer page, Integer size, SUserVo userVo) {
        Pageable pageable = PageRequest.of(page, size, Sort.Direction.ASC, "userName");
        Page<SUser> users = userRepository.findAll(new Specification(){
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery query, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.and();
            }
        },pageable);
        return users;
    }
}
