package com.spring.preon.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProDAOImple implements ProDAO{
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public String bringData() {
		// TODO Auto-generated method stub
		
		return sqlsession.selectOne("mapper.test.bringData");
	}
	
}
