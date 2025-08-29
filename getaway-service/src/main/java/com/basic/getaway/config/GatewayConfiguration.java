package com.basic.getaway.config;

import com.basic.getaway.filter.RequestGlobalFilter;
import com.basic.getaway.module.GlobalExceptionHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * <p>网关配置类</p>
 * @author: syl
 * @Date: 2025/9/20
 */
@Configuration(proxyBeanMethods = false)
public class GatewayConfiguration {


    /**
     * 创建PigRequest全局过滤器
     * @return PigRequest全局过滤器
     */
    @Bean
    public RequestGlobalFilter requestGlobalFilter() {
        return new RequestGlobalFilter();
    }

    /**
     * 创建全局异常处理程序
     * @param objectMapper 对象映射器
     * @return 全局异常处理程序
     */
    @Bean
    public GlobalExceptionHandler globalExceptionHandler(ObjectMapper objectMapper) {
        return new GlobalExceptionHandler(objectMapper);
    }
}
