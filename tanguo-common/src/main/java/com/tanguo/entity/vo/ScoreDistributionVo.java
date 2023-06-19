package com.tanguo.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ：cyp
 * @date ：Created in 2023-06-19 18:00:09
 * @description：分值分布管理
 * @modified By：
 * @version: 1.0$
 */
@Data
@ApiModel(description = "分值分布管理参数接受类")
public class ScoreDistributionVo {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "id")
	private Long id;
	@ApiModelProperty(value = "名称")
	private String name;

}
