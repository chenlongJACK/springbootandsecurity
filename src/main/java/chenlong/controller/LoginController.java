package chenlong.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Controller
@RequestMapping("/security")
public class LoginController {
    @RequestMapping("/toLogin")
    public String toLogin(HttpServletRequest request){
        String contextPath = request.getContextPath();
        System.out.println(contextPath);
        return "login";
    }
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
    @RequestMapping("/error")
    public String error(){
        return "error";
    }

}
