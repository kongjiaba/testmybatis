package sy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sy.dao.UserMapper;
import sy.model.User;

import java.util.List;

/**
 * @author WJUN
 * @create 2018/10/29 21:11
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    public UserMapper getUserMapper() {
        return userMapper;
    }
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public User getUserById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> getAll2() {
        return userMapper.getAll2();
    }

    @Override
    public List<User> getAll3() {
        return userMapper.getAll3();
    }

    @Override
    public List<User> getAll4() {
        return userMapper.getAll4();
    }
}
