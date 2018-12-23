package net.xdclass.demo.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * @Author: liuyang
 * @Date: 2018-12-2200:42
 * @Description: <描述>
 */
public class User {

    private String UserName;
    @JsonIgnore
    private String passwd;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("hideage")
    private Integer age;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
    private Date createDate;


    public User() {
    }

    public User(String userName, Integer age, Date createDate) {
        UserName = userName;
        this.age = age;
        this.createDate = createDate;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }





    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}