package com.tang.spring.security.oauth.server.mapper;

import com.tang.spring.security.oauth.server.domain.SysPermission;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

/**
 * @author ASUS
 * @create 2019-08-14 21:36
 */
public interface PermissionMapper extends MyMapper<SysPermission> {
//  查询根据用户名查询用户权限
    public List<SysPermission> selectPromissionByUserName(String username);

}
