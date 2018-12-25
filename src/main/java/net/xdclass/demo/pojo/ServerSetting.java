package net.xdclass.demo.pojo;

import com.sun.xml.internal.ws.developer.Serialization;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Author: liuyang
 * @Date: 2018-12-2407:40
 * @Description: <描述>
 */

@Component
@ConfigurationProperties(prefix="test")
@PropertySource(value="classpath:application.properties")

public class ServerSetting {

    public String path;
    public String name;
    public String domain;
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}