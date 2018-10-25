package com.caoyj.swagger.dubbo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Description
 * Created by caoyj on 2018/10/16.
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"io.hulk.dubbo.springfox.core"})
public class SwaggerDubboConfig {

//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .build()
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("对外开放接口API 文档")
//                .description("HTTP对外开放接口")
//                .version("1.0.0")
//                .termsOfServiceUrl("http://xxx.xxx.com")
//                .license("LICENSE")
//                .licenseUrl("http://xxx.xxx.com")
//                .build();
//    }

}