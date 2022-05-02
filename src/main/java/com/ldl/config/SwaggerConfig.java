package com.ldl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
//    @Bean
//    public Docket docket1() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("A的分组");
//    }
//
//    @Bean
//    public Docket docket2() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("B的分组");
//    }
//
//    @Bean
//    public Docket docket3() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("C的分组");
//    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("ldl")//默认是default,在页面右上角
                .select()
                //apis：指定要扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.ldl.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        //contact为作者信息
        Contact contact = new Contact("ldl", "http://172.16.8.201:8080/countryMedia/", "971335694@qq.com");
        return new ApiInfo(
                "SwaggerAPI文档",
                "前端接口",
                "1.0",
                "172.16.8.201:8080/countryMedia",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0");
    }
}