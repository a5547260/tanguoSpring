package com.tanguo.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tanguo.entity.po.ScoreDistribution;
import com.tanguo.service.ScoreDistributionService;
import lombok.AllArgsConstructor;

/**
 * @author cyp
 * @date 2023/6/19
 */

@RestController
@AllArgsConstructor
@RequestMapping("/first")
@Api(value = "first", tags = "first")
public class FirstController {

	private final ScoreDistributionService scoreDistributionService;

	@ApiOperation("demo1")
	@GetMapping(value = "/demo1")
	public void test() {
		List<ScoreDistribution> list = scoreDistributionService.lambdaQuery()
			.list();
		System.err.println(list.get(0)
			.getName());
		System.err.println("first");
	}
}
