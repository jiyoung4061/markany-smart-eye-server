package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.UserService;
import com.markany.mysite.vo.UserVo;

@CrossOrigin
@RestController("UserApiController")
@RequestMapping("/api/user")
public class UserController {	
	@Autowired
	private UserService userService;
	
	// user list 불러오기
	@RequestMapping("/list")
	public JsonResult index(Model model) {
		List<UserVo> list = userService.getUserList();
		return JsonResult.success(list);
	}
	
	// user 추가하기
	@RequestMapping("/add")
	public JsonResult add(@RequestBody UserVo uservo) {
		userService.joinUser(uservo);
		return JsonResult.success(uservo);
	}
	
	// user 수정하기
	@RequestMapping("/update")
	public JsonResult update(@RequestBody UserVo uservo) {
		userService.updateUser(uservo);
		return JsonResult.success(uservo);
	}
	
	// user 삭제하기
	@RequestMapping("/delete")
	public JsonResult delete(@RequestBody UserVo uservo) {
		userService.deleteUser(uservo.getId());
		return JsonResult.success(uservo);
	}
}