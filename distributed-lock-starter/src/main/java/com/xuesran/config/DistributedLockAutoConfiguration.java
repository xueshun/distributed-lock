package com.xuesran.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * The type Distributed lock auto configuration.
 *
 * @author xueshun
 */
@Configuration
@EnableConfigurationProperties(DistributedLockProperties.class)
public class DistributedLockAutoConfiguration {
}
