package com.one.springbootsetting.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties 从application配置文件中读取配置
 * prefix 表示配置项的前缀
 * 配置项类中的变量名必须与前缀之后的配置项名保持松散绑定（相同）
 */
@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String userName;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

