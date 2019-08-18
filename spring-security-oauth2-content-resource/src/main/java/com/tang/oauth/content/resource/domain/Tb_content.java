package com.tang.oauth.content.resource.domain;

import lombok.Data;

/**
 * @author Tang
 * @create 2019-08-17 17:00:14
 */
@Data
public class Tb_content {

	private String id;

	private String category_id;

	private String title;

	private String sub_title;

	private String title_desc;

	private String url;

	private String pic;

	private String pic2;

	private String content;

	private java.util.Date created;

	private java.util.Date updated;

}