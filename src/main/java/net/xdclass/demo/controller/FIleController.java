package net.xdclass.demo.controller;

import net.xdclass.demo.pojo.JsonData;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * @Author: liuyang
 * @Date: 2018-12-2321:54
 * @Description: <描述>
 */
@RestController
public class FIleController {

    private String filePath = "";

    @RequestMapping(path="/upload")
    public JsonData upload(@RequestParam("head_img")MultipartFile file, HttpServletRequest request){

        String name = request.getParameter("name");

        System.out.println("姓名=="+name);
        String filename = file.getOriginalFilename();
        System.out.println("文件名===."+filename);

        String suffixName = filename.substring(filename.lastIndexOf("."));

        System.out.println("文件名后缀==="+suffixName);

        filename = UUID.randomUUID()+"9999999"+suffixName;

        System.out.println("上传后的文件名==="+filename);
System.out.println("热部署.");
System.out.println("热部署1.");
System.out.println("热部署2.");
System.out.println("热部署3.");
System.out.println("热部署4.");
System.out.println("热部署5.");
System.out.println("热部署6.");
System.out.println("热部署7.");
        try{

            filePath =ResourceUtils.getURL("classpath:").getPath();
            File destFile = new File(filePath+filename);
            System.out.println(destFile.getPath());
            file.transferTo(destFile);
            return new JsonData(666666,destFile.getPath(),null);
        }catch (Exception e){

        e.printStackTrace();

        }
        return new JsonData(-111111, null);
    }
}