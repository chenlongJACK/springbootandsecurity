package chenlong.config;

import chenlong.bean.User;
import chenlong.bean.UserInfo;
import chenlong.dao.UserMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService implements UserDetailsService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //这里可以可以通过username（登录时输入的用户名）然后到数据库中找到对应的用户信息，并构建成我们自己的UserInfo来返回。
        User user = userMapper.findByUserName(userName);
        if(user!=null){
           UserInfo userInfo=new UserInfo(user.getUsername(),user.getPassword(),"ROLE_ADMIN",
                   true,true,true,true,user);
           return userInfo;
       }
        return null;
    }
}
