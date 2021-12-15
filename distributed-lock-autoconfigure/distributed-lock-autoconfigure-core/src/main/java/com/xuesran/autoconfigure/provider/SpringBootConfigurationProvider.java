package com.xuesran.autoconfigure.provider;

import com.xuesran.common.holder.ObjectHolder;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import static com.xuesran.common.Constants.OBJECT_KEY_SPRING_APPLICATION_CONTEXT;

/**
 * The type Spring boot configuration provider.
 *
 * @author xueshun
 */
public class SpringBootConfigurationProvider implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.setProperty("file.listener.enabled", "false");
        ObjectHolder.INSTANCE.setObject(OBJECT_KEY_SPRING_APPLICATION_CONTEXT, applicationContext);
    }
}
