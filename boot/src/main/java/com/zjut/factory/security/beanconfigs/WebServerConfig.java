package com.zjut.factory.security.beanconfigs;

import com.zjut.factory.security.config.properties.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * 设置相关web参数
 * springboot2.x以上版本EmbeddedServletContainerCustomizer已被替代
 */
@Configuration
public class WebServerConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Autowired
    private ApplicationProperties applicationProperties;

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(applicationProperties.getServerPort());
    }

}
