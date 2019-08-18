package com.tang.spring.security.oauth.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * @author ASUS
 * @create 2019-08-07 20:21
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcClientDetailsService jdbcClientDetailsService() {
//      jdbc 的方式 处理 client
        JdbcClientDetailsService detailsService = new JdbcClientDetailsService(dataSource);
        return detailsService;
    }

    @Bean
    public TokenStore tokenStore() {
//        jdbc 的方式 处理token
        return new JdbcTokenStore(dataSource);
    }

    /**
     * 客户端认证配置
     * @param clients
     * @throws Exception
     */
    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//      配置 jdbc 客户端信息
        clients.withClientDetails(jdbcClientDetailsService());
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception { }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//      配置 jdbc token 信息
        endpoints.tokenStore(tokenStore());
    }
}
