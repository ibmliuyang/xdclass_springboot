package xdclass.spring.demo;

import junit.framework.TestCase;
import net.xdclass.demo.TestSpringBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @Author: liuyang
 * @Date: 2018-12-2409:29
 * @Description: <描述>
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes={TestSpringBootApplication.class})
@AutoConfigureMockMvc
public class MockMacTestDemo {

    @Autowired
    private MockMvc mockMvc;
    @Test
    public void apiTest() throws  Exception{
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/v1/test_properties")).andReturn();
        int status = mvcResult.getResponse().getStatus();
        TestCase.assertEquals(status, 200);
    }

}