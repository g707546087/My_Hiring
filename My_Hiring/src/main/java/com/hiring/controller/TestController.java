/**
 * Create Date:2017年11月22日
 */
package com.hiring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiring.dao.UserDao;
import com.hiring.model.UserInfo;

/**
 * Title:TODO 类标题
 * Description:TODO 类功能描述
 * Author:guole
 * Date:2017年11月22日
 */
@Controller
@RequestMapping("testController")
public class TestController {
	
	@Autowired
 private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@RequestMapping("index")
	public String index( HttpSession session,Model model) {
		List<UserInfo> users=userDao.getAll();
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i).getUserName());
		}
		return "index";
	}
}
