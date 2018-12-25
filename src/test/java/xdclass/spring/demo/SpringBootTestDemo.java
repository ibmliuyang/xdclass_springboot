package xdclass.spring.demo;

import junit.framework.TestCase;
import net.xdclass.demo.TestSpringBootApplication;
import net.xdclass.demo.pojo.ServerSetting;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: liuyang
 * @Date: 2018-12-2409:05
 * @Description: <描述>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={TestSpringBootApplication.class})
public class SpringBootTestDemo {
    @Autowired
    private ServerSetting serverSetting;
    @Test
    public void testTwo() {
        TestCase.assertEquals(serverSetting.getName(), "liuyangMAC");
    }

    @Test
    public void testOne() {

        TestCase.assertEquals(serverSetting.getPath(), "hahahagaga/appli123");
    }
}