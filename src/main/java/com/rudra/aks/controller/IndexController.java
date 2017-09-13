package com.rudra.aks.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rudra.aks.fluentd.logger.DemoLogger;

@RestController
public class IndexController {

	DemoLogger logger = new DemoLogger(IndexController.class);
	
	@RequestMapping(path = "/")
	public String index(HttpServletRequest request, HttpServletResponse response ) {
		logger.setCtxString("context added");
		logger.info("index controller");
		return "index";
	}
}
