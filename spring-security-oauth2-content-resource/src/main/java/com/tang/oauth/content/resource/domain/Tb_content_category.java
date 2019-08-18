package com.tang.oauth.content.resource.domain;

import lombok.Data;

/**
 * @author Tang
 * @create 2019-08-17 17:00:14
 */
@Data
public class Tb_content_category {

	private String id;

	private String parent_id;

	private String name;

	private Integer status;

	private Integer sort_order;

	private String is_parent;

	private java.util.Date created;

	private java.util.Date updated;

}