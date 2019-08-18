package com.tang.oauth.content.resource.service.impl;

import com.tang.oauth.content.resource.domain.Tb_content;
import com.tang.oauth.content.resource.mapper.TbContentMapper;
import com.tang.oauth.content.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ASUS
 * @create 2019-08-17 18:09
 */
@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    public TbContentMapper tbContentMapper;

    @Override
    public List<Tb_content> selectAll() {

        return tbContentMapper.selectAll();

    }
}
