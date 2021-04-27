package com.markany.mysite.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.markany.mysite.vo.CCTVGroupVo;

@Repository
public class CCTVGroupRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<CCTVGroupVo> findAll() {
		return sqlSession.selectList("cctvgroup.findAll");
	}
	
	public List<CCTVGroupVo> findListWithId(Long id) {
		return sqlSession.selectList("cctvgroup.findlistbyid", id);
	}
}
