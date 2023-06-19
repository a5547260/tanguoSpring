package com.tanguo.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tanguo.service.ScoreDistributionService;
import lombok.AllArgsConstructor;

/**
 * @author ：cyp
 * @date ：Created in 2023-06-19 18:00:09
 * @description：分值分布管理
 * @modified By：
 * @version: 1.0$
 */
@RestController
@AllArgsConstructor
@RequestMapping("/scoredistribution")
@Api(value = "scoredistribution", tags = "分值分布管理管理")
public class ScoreDistributionController {

	private final ScoreDistributionService scoreDistributionService;

}
