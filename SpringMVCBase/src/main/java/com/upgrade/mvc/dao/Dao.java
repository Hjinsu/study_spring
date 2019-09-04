package com.upgrade.mvc.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.upgrade.mvc.dto.Emp;

@Repository
public class Dao implements DaoImpl{
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<Emp> selectlist() {
		List<Emp> list = null;
		
		list = sqlSession.selectList("emp.selectlist");
		
		return list;
	}

}
