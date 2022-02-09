package com.wg.authority.common.swagger;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class swaggerConfig {
    @Bean
    public Docket webApiConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                .paths(Predicates.not(PathSelectors.regex("/error.*")))
                .build();

    }

    private ApiInfo webApiInfo(){

        return new ApiInfoBuilder()
                .title("网站-课程中心API文档")
                .description("本文档描述了课程中心微服务接口定义")
                .version("1.0")
                .contact(new Contact("Helen", "http://wg.com", "55317332@qq.com"))
                .build();
    }
//    public static final String AUTHORIZATION = "Authorization";
//    public static final String MODELREF = "string";
//    public static final String PARAMETERTYPE = "header";
//    public static final String TITLE = "SpringSecurity学习";
//    public static final String DESCRIPTION = "Learn more about SpringSecurity!";
//    public static final String VERSION = "1.0";
//
//    @Bean
//    public Docket createRestApi() {
//        // 添加请求参数, 把token作为请求头参数
//        ParameterBuilder builder = new ParameterBuilder();
//        List<Parameter> parameters = new ArrayList<>();
//
//        builder.name(AUTHORIZATION)
//                .description("请求令牌")
//                .modelRef(new ModelRef(MODELREF))
//                .parameterType(PARAMETERTYPE)
//                .required(false)
//                .build();
//
//        parameters.add(builder.build());
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build()
//                .globalOperationParameters(parameters);
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title(TITLE)
//                .description(DESCRIPTION)
//                .version(VERSION)
//                .build();
//    }
}
