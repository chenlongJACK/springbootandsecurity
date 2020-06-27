package chenlong;

import chenlong.bean.Person;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2);
        Map<String,Object> map=new HashMap<>();
        Person person=new Person();
        person.setAge(19);
        person.setName("jack");
        person.setNums(nums);
        List<Person> list =new ArrayList<>();
        list.add(person);
        list.add(person);
        map.put("personList",list);
        map.put("ds","你是弱智");
        createWord(map,"print.ftl","D:\\","table");
        /*
        File file=new File("D:\\develop\\IdeaProject\\springboot_demo\\springbootandsecurity\\src\\main\\resources\\ftl\\table.doc");
        String path="D:\\develop\\IdeaProject\\springboot_demo\\springbootandsecurity\\src\\main\\resources\\ftl\\table22.doc";
        upload(file,path);*/
    }

    /**
     * 生成word文件
     * @param dataMap word中需要展示的动态数据，用map集合来保存
     * @param templateName word模板名称，例如：model.ftl
     * @param filePath 文件生成的目标路径，例如：D:\\freemarker
     * @param fileName 生成的文件名称，例如：Test.doc
     */
    public static void createWord(Map dataMap, String templateName, String filePath, String fileName){
        try {
            //创建配置实例
            Configuration configuration = new Configuration();

            //设置编码
            configuration.setDefaultEncoding("utf-8");
            String property = System.getProperty("user.dir");
            System.out.println(property);
            //ftl模板文件
            //configuration.setClassForTemplateLoading(Test.class,"/");
            configuration.setDirectoryForTemplateLoading(new File(property+"/springbootandsecurity/src/main/resources/ftl/"));
            //获取模板
            Template template = configuration.getTemplate(templateName);
            String docId = UUID.randomUUID().toString();
            //输出文件
            File outFile = new File(""+property+"/springbootandsecurity/src/main/resources/ftl/"+docId+".doc");

            //如果输出目标文件夹不存在，则创建
            if (!outFile.getParentFile().exists()){
                outFile.getParentFile().mkdirs();
            }

            //将模板和数据模型合并生成文件
            Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile),"utf-8"));


            //生成文件
            template.process(dataMap, out);

            //关闭流
            out.flush();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void upload(File file,String path){
        try {
            FileInputStream fis=new FileInputStream(file);
            FileOutputStream fos=new FileOutputStream(new File(path));
            byte[] data=new byte[1024];
            int i =0;
            while((i=fis.read(data))!=-1){
                fos.write(data,0,i);
            }
            fos.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
