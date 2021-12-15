package com.xuesran.autoconfiguration.properties.store;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import static com.xuesran.autoconfigure.StarterConstants.*;

/**
 * The type Store redis properties.
 *
 * @author xueshun
 */
@Component
@ConfigurationProperties(prefix = STORE_REDIS_PREFIX)
public class StoreRedisProperties {
    /**
     * single, sentinel
     */
    private String mode = "single";
    private String password = null;
    private Integer maxConn = 10;
    private Integer minConn = 1;
    private Integer database = 0;
    private Integer queryLimit = 100;
    private Integer maxTotal = 100;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMaxConn() {
        return maxConn;
    }

    public void setMaxConn(Integer maxConn) {
        this.maxConn = maxConn;
    }

    public Integer getMinConn() {
        return minConn;
    }

    public void setMinConn(Integer minConn) {
        this.minConn = minConn;
    }

    public Integer getDatabase() {
        return database;
    }

    public void setDatabase(Integer database) {
        this.database = database;
    }

    public Integer getQueryLimit() {
        return queryLimit;
    }

    public void setQueryLimit(Integer queryLimit) {
        this.queryLimit = queryLimit;
    }

    public Integer getMaxTotal() {
        return maxTotal;
    }

    public void setMaxTotal(Integer maxTotal) {
        this.maxTotal = maxTotal;
    }

    @Component
    @ConfigurationProperties(prefix = STORE_REDIS_SINGLE_PREFIX)
    public static class Single {
        private String host = "127.0.0.1";
        private Integer port = 6379;

        public String getHost() {
            return host;
        }

        public Single setHost(String host) {
            this.host = host;
            return this;
        }

        public Integer getPort() {
            return port;
        }

        public Single setPort(Integer port) {
            this.port = port;
            return this;
        }
    }



    @Component
    @ConfigurationProperties(prefix = STORE_REDIS_SENTINEL_PREFIX)
    public static class Sentinel {
        private String masterName = "";
        /**
         * such as "10.28.235.65:26379,10.28.235.65:26380,10.28.235.65:26381"
         */
        private String sentinelHosts = "";

        public String getMasterName() {
            return masterName;
        }

        public Sentinel setMasterName(String masterName) {
            this.masterName = masterName;
            return this;
        }

        public String getSentinelHosts() {
            return sentinelHosts;
        }

        public Sentinel setSentinelHosts(String sentinelHosts) {
            this.sentinelHosts = sentinelHosts;
            return this;
        }
    }
}
