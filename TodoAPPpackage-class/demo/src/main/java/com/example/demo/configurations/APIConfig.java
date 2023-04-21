package com.example.demo.configurations;

import io.swagger.models.Info;
import io.swagger.models.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class APIConfig {

    @Bean
    public Docket TodoAPIDocumentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo("a","b","c","d",new Contact("name", "url", "m@gmail.com"),"Mainak Ghosh","Mainak license Url", Collections.emptyList()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }

}
