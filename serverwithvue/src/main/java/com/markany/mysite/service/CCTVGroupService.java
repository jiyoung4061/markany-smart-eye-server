package com.markany.mysite.service;

import java.util.List;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.CCTVGroupRepository;
import com.markany.mysite.vo.CCTVGroupVo;

@Service
public class CCTVGroupService {
	
	@Autowired
	private CCTVGroupRepository cctvGroupRepository;

	public List<CCTVGroupVo> getCCTVGroupList() {
		return cctvGroupRepository.findAll();
	}

	public List<CCTVGroupVo> getListWithUser(Long id) {
		return cctvGroupRepository.findListWithId(id);
	}
}
