package com.markany.mysite.repository;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.UserVo;

@Repository
public class UserRepository {
	
	@Autowired
	SqlSession sqlSession;
	
	public List<UserVo> findAll() {
		return sqlSession.selectList("user.findAll");
	}
	
	public int insert(UserVo uservo) {
		return sqlSession.insert("user.insert", uservo);
	}

	public int update(UserVo uservo) {
		return sqlSession.update("user.update", uservo);
	}
	
	public int delete(Long id) {
		return sqlSession.delete("user.delete", id);
	}
}
