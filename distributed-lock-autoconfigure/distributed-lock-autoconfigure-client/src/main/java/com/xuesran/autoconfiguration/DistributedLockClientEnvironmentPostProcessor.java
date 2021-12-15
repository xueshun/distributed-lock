package com.xuesran.autoconfiguration;

import com.xuesran.autoconfiguration.properties.DistributedLockProperties;
import com.xuesran.autoconfiguration.properties.store.StoreRedisProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

import static com.xuesran.autoconfigure.StarterConstants.*;

/**
 * The type Distributed lock client environment post processor.
 *
 * @author xueshun
 */
public class DistributedLockClientEnvironmentPostProcessor implements EnvironmentPostProcessor, Ordered {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
        PROPERTY_BEAN_MAP.put(DISTRIBUTED_LOCK_PREFIX, DistributedLockProperties.class);
        PROPERTY_BEAN_MAP.put(STORE_REDIS_PREFIX, StoreRedisProperties.class);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
