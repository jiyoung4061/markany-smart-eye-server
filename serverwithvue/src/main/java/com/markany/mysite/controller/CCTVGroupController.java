package com.markany.mysite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.markany.mysite.dto.JsonResult;
import com.markany.mysite.service.CCTVGroupService;
import com.markany.mysite.vo.CCTVGroupVo;
import com.markany.mysite.vo.UserVo;

@CrossOrigin
@RestController("CCTVGroupApiController")
@RequestMapping("/api/cctvgroup")
public class CCTVGroupController {	
	@Autowired
	private CCTVGroupService cctvgroupService;
	
	@RequestMapping("/list")
	public JsonResult index(Model model) {
		List<CCTVGroupVo> list = cctvgroupService.getCCTVGroupList();
		System.out.println(">>>"+ list);
		return JsonResult.success(list);
	}
	
	@RequestMapping("/listwithuser")
	public JsonResult getListWithUser(@RequestBody UserVo uservo) {
		List<CCTVGroupVo> list = cctvgroupService.getListWithUser(uservo.getId());
		System.out.println(">>>" + list);
		return JsonResult.success(list);
	}
}