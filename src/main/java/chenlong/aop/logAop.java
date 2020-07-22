package chenlong.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName logAop
 * @Description TODO
 * @Author jack
 * @Date 2020/7/5 23:06
 * @Version 1.0
 */
@Aspect
@Component
public class logAop {
    @Pointcut("execution(public * chenlong.controller.*.*(..))")
    public void logAop() {
    }
    @Before("logAop()")
    public void doBefore(JoinPoint joinPoint){

        System.out.println("方法执行前");
    }
}
