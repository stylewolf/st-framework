package org.st.framework.service.system.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application-test.yml"})
public class UserServiceTest {
    @Autowired
    private UserServiceImp userServiceImp;
    @Test
    public void findById() {
        System.out.println(1);
    }

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void page() {
    }
}