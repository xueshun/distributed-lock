package com.xuesran.autoconfigure;

import java.util.HashMap;

/**
 * The type Starter constants.
 *
 * @author xueshun
 */
public interface StarterConstants {
    String DISTRIBUTED_LOCK_PREFIX = "spring.lock";
    String STORE_PREFIX = DISTRIBUTED_LOCK_PREFIX + ".store";

    String LOG_PREFIX = DISTRIBUTED_LOCK_PREFIX + ".log";
    /**
     * spring.lock.store.redis
     */
    String STORE_REDIS_PREFIX = STORE_PREFIX + ".redis";

    String STORE_REDIS_SINGLE_PREFIX = STORE_REDIS_PREFIX + ".single";
    String STORE_REDIS_SENTINEL_PREFIX = STORE_REDIS_PREFIX + ".sentinel";


    String STORE_ZK_PREFIX = STORE_PREFIX + ".zk";

    int MAP_CAPACITY = 64;
    HashMap<String, Class<?>> PROPERTY_BEAN_MAP = new HashMap<>(MAP_CAPACITY);
}
