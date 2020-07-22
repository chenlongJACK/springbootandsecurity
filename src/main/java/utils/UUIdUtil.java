package utils;

import java.util.UUID;

/**
 * @ClassName
 * @Description Id处理工具类
 * @Author jack
 * @Date 2020/6/27 23:21
 * @Version 1.0
 */
public class UUIdUtil {
    private static String getUUId(){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        return  id;
    }
}
