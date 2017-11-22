/**
 * Create Date:2017年11月22日
 */
package com.hiring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title:TODO 类标题
 * Description:TODO 类功能描述
 * Author:guole
 * Date:2017年11月22日
 */
@Controller
@RequestMapping("testController")
public class TestController {
	@RequestMapping("index")
	public String index( HttpSession session,Model model) {
		return "index";
	}
}
