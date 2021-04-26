package com.markany.mysite.service;

import java.util.List;

//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.CCTVRepository;
import com.markany.mysite.vo.CCTVVo;

@Service
public class CCTVService {
	
	@Autowired
	private CCTVRepository cctvRepository;

	public List<CCTVVo> getCCTVList() {
		return cctvRepository.findAll();
	}
}
