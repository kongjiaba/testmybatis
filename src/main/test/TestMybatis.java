import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sy.model.Role;
import sy.model.User;
import sy.model.UserRole;
import sy.service.UserService;

import java.util.List;

/**
 * @author WJUN
 * @create 2018/10/29 21:19
 *
 * 注解@RunWith(SpringJUnit4ClassRunner.class)继承了SpringJUnit4ClassRunner
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestMybatis {
    private static final Logger logger = Logger.getLogger(TestMybatis.class);
    /*private ApplicationContext ac;
    private UserService userService;
    @Before
    public void before(){
        ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
        userService = (UserService) ac.getBean("userService");
    }

    @Test
    public void test1(){
        User u = userService.getUserById("001");
        System.out.println(u);
    }*/
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @Test
    public void test1(){
        User u = userService.getUserById("002");
//        System.out.println(u);
        logger.debug(u);
    }
    @Test
    public void test2(){
        List<User> list = userService.getAll();
        for(User u:list){
            logger.debug(u);
            for (UserRole userRole:u.getUserRoles()){
                logger.debug(userRole);
            }
        }
    }
    @Test
    public void test3(){
        List<User> list = userService.getAll2();
        for(User u:list){
            logger.debug(u);
            for (UserRole userRole:u.getUserRoles()){
                logger.debug(userRole);
            }
        }
    }

    @Test
    public void test4(){
        List<User> list = userService.getAll3();
        for(User u:list){
            logger.debug(u);
            for (UserRole userRole:u.getUserRoles()){
                logger.debug(userRole);
                logger.debug(userRole.getRole());
            }
        }
    }
    @Test
    public void test5(){
        List<User> list = userService.getAll4();
        for(User u:list){
            logger.debug(u);
            for (Role role:u.getRoles()){
                logger.debug(role);
            }
        }
    }
}
