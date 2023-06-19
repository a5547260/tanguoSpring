package com.tanguo.entity.po;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

/**
 * @author ：cyp
 * @date ：Created in 2023-06-19 18:00:09
 * @description：分值分布管理
 * @modified By：
 * @version: 1.0$
 */
@Data
@TableName("cr_score_distribution")
@ApiModel(description = "分值分布管理实体类")
@Entity(name = "cr_score_distribution")
public class ScoreDistribution extends Model<ScoreDistribution> {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("主键ID")
	@TableField("id ")
	@TableId
	@Id
	private Long id;

	@ApiModelProperty(value = "名称")
	@TableField("name ")
	private String name;

}
