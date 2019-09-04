package com.upgrade.mvc.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upgrade.mvc.dao.Dao;
import com.upgrade.mvc.dto.Emp;

@Service
public class Biz implements BizImpl{
	@Autowired
	private Dao dao;
	
	@Override
	public List<Emp> selectlist() {
		// TODO Auto-generated method stub
		return dao.selectlist();
	}

}
