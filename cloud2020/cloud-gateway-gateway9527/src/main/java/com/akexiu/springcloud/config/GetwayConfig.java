package com.akexiu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * 描述:
 *
 * @outhor akexiu
 * @create 2020-03-15 20:42
 */
@Configuration
public class GetwayConfig {
    //代码实现服务网关
    @Bean
    public RouteLocator cousterRoteLocater(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes  =routeLocatorBuilder.routes();

        routes.route("rotue_getway",
                r -> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei")).build();
        routes.route("rotue_getway2",
                r -> r.path("/lady")
                        .uri("http://news.baidu.com/lady")).build();

        return routes.build();



    }

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

    }
}
