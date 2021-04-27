package com.markany.mysite.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.UserRepository;
import com.markany.mysite.vo.UserVo;

@Service
public class UserService {
	private static final Log LOGGER = LogFactory.getLog(UserService.class);

	@Autowired
	private UserRepository userRepository;

	public List<UserVo> getUserList() {
		return userRepository.findAll();
	}
	
	public void joinUser(UserVo uservo) {
		userRepository.insert(uservo);
	}
	
	public boolean updateUser(UserVo uservo) {
		int count = userRepository.update(uservo);
		return count == 1;
	}
	
	
	
	
	public UserVo getUser(Long id) {
		return userRepository.findById(id);
	}
	public UserVo getUser(UserVo vo) {
		// System.out.println("findbyEmail-->" + userRepository.findByEmail(vo.getEmail()));
		// return userRepository.findByEmailAndPassword2(vo);
		return userRepository.findByIdAndPassword(vo);
	}

	
	
	
	
	
//	public boolean join(UserVo vo) {
//		LOGGER.info("before--->" + vo);
//		int count = userRepository.insert(vo);
//		LOGGER.info("after--->" + vo);
//
//		return count == 1;
//	}
//	


	

	
}

