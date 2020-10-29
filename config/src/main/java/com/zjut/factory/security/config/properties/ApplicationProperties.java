package com.zjut.factory.security.config.properties;

import lombok.Data;
import org.springframework.stereotype.Component;


/**
 * 设置相关配置参数，后期整合相关配置中心后，将参数整合到具体的配置中心
 * 目前想法是整合nacos
 */
@Component
@Data
public class ApplicationProperties {

    /**
     * 服务的自定义端口
     */
    private Integer serverPort = 8000;
}
