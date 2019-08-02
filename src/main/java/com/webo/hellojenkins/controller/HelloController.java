/**
 * 
 */
package com.webo.hellojenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author wemin
 */
@RestController
public class HelloController {

	@RequestMapping("login")
	public String login(){
		return "ok";
	}
}
