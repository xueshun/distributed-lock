package com.xuesran.autoconfiguration.properties;

import com.xuesran.autoconfigure.StarterConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static com.xuesran.autoconfigure.StarterConstants.DISTRIBUTED_LOCK_PREFIX;

/**
 * The type Distributed lock properties.
 *
 * @author xueshun
 */
@Component
@ConfigurationProperties(prefix = DISTRIBUTED_LOCK_PREFIX)
public class DistributedLockProperties {

    /**
     * 是否启用
     */
    private boolean enabled = true;

    /**
     * 锁标志存储位置
     */
    private String mode = "redis";

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
