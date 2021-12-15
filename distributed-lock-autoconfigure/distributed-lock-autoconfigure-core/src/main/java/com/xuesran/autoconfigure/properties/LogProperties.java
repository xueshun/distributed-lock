package com.xuesran.autoconfigure.properties;

import com.xuesran.autoconfigure.StarterConstants;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static com.xuesran.autoconfigure.StarterConstants.LOG_PREFIX;

/**
 * The type Log properties.
 *
 * @author xueshun
 */
@Component
@ConfigurationProperties(prefix = LOG_PREFIX)
public class LogProperties {
}
