package com.tang.spring.security.oauth.server.config;

import com.tang.spring.security.oauth.server.domain.SysPermission;
import com.tang.spring.security.oauth.server.domain.SysUser;
import com.tang.spring.security.oauth.server.mapper.PermissionMapper;
import com.tang.spring.security.oauth.server.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

/**
 * 从数据库中查询用户权限
 * @author ASUS
 * @create 2019-08-14 21:06
 */
@Service
public class JdbcUserDetailService implements UserDetailsService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Example example = new Example(SysUser.class);

        example.createCriteria().andEqualTo("username", username);
//          查询用户
        SysUser sysUser = userMapper.selectOneByExample(example);

        if (sysUser != null) {
//          查询用户权限信息
            List<SysPermission> permissionList = permissionMapper.selectPromissionByUserName(username);

            List<GrantedAuthority> list = new ArrayList<>();

            permissionList.forEach((permission) -> {

                System.out.println(permission.getPerTag());

                list.add(new SimpleGrantedAuthority(permission.getPerTag()));

            });

            sysUser.setAuthorities(list);
        }

        return new User(sysUser.getUsername(), sysUser.getPassword(), sysUser.getAuthorities());
    }
}
