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
    @RequestMapping("/downDoc")
    public void downDoc(String docName, HttpServletResponse response){
        response.setHeader("Content-Disposition", "attachment; filename="+docName+".doc");
        String property = System.getProperty("user.dir");

        try {
            InputStream is=new FileInputStream(property+"/springbootandsecurity/src/main/resources/ftl/"+docName+".doc");
            OutputStream os=response.getOutputStream();
            int len=0;
            byte[] data=new byte[1024];
            while((len=is.read(data))!=-1){
                os.write(data);
            }
            os.close();
            is.close();
        } catch (Exception e) {
            throw new RuntimeException("文件不存在");
        }
    }
}
