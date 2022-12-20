package com.example.studydanvegasecurity;

import com.example.studydanvegasecurity.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class StudyDanVegaSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyDanVegaSecurityApplication.class, args);
    }

}
