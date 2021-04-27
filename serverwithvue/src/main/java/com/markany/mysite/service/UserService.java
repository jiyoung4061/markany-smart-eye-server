package com.markany.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markany.mysite.repository.UserRepository;
import com.markany.mysite.vo.UserVo;

@Service
public class UserService {

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
	
	public boolean deleteUser(Long id) {
		int count = userRepository.delete(id);
		return count > 0;
	}
	
}

