package com.xuesran.config;

import com.xuesran.constants.StarterConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static com.xuesran.constants.StarterConstants.DISTRIBUTED_LOCK_PREFIX;

/**
 * The type Distributed lock properties.
 *
 * @author xueshun
 */
@ConfigurationProperties(prefix = DISTRIBUTED_LOCK_PREFIX)
public class DistributedLockProperties {
    /**
     * 存取方式
     */
    private String mode;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
