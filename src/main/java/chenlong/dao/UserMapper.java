package chenlong.dao;

import chenlong.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {


    int insert(User record);

    User findByUserName(String userName);
}