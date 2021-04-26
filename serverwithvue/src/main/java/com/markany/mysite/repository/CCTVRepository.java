package com.markany.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.CCTVVo;

@Repository
public class CCTVRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<CCTVVo> findAll() {
		return sqlSession.selectList("cctv.findAll");
	}
}
