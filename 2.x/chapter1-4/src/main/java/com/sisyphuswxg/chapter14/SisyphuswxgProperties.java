package com.sisyphuswxg.chapter14;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "com.sisyphuswxg")
public class SisyphuswxgProperties {

    private String name;
    private Integer age;
    private String from;

    @Override
    public String toString() {
        return "SisyphuswxgProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", from='" + from + '\'' +
                '}';
    }
}
