package com.tang.oauth.content.resource.web;

import com.tang.oauth.content.resource.domain.Tb_content;
import com.tang.oauth.content.resource.dto.ResponseResult;
import com.tang.oauth.content.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ASUS
 * @create 2019-08-17 18:11
 */
@RestController
public class TbContentController {

    @Autowired
    public TbContentService tbContentServiceImpl;

    @GetMapping("/alls")
    public ResponseResult<List<Tb_content>> selectAll() {

        return new ResponseResult<List<Tb_content>>(HttpStatus.OK.value(),"成功取到数据！",tbContentServiceImpl.selectAll());
    }

}
