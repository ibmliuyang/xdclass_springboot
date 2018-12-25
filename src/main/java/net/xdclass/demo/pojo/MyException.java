package net.xdclass.demo.pojo;

/**
 * @Author: liuyang
 * @Date: 2018-12-2413:01
 * @Description: <描述>
 */
public class MyException extends RuntimeException {

    private String code;
    private String mgs;

    public MyException() {
    }

    public MyException(String code, String mgs) {
        this.code = code;
        this.mgs = mgs;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMgs() {
        return mgs;
    }

    public void setMgs(String mgs) {
        this.mgs = mgs;
    }
}