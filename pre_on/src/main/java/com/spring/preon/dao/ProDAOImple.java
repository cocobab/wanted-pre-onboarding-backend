package com.spring.preon.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.preon.dto.NotiCompanyDTO;


@Repository
public class ProDAOImple implements ProDAO{
	
	@Autowired
	private SqlSession sqlsession;

	@Override
	public String bringData() {
		// TODO Auto-generated method stub
		
		return sqlsession.selectOne("mapper.test.bringData");
	}
	
	@Override
	public int addNotice(Map<String, Object> noticeMap) {
		// TODO Auto-generated method stub
		return sqlsession.insert("mapper.notice.addNotice", noticeMap);
	}

	@Override
	public List<NotiCompanyDTO> listNotice() {
		// TODO Auto-generated method stub
		return sqlsession.selectList("mapper.notice.listNotice");
	}

	@Override
	public NotiCompanyDTO selectDetail(int noticeId) {
		// TODO Auto-generated method stub
		return sqlsession.selectOne("mapper.notice.selectDetail", noticeId);
	}
	
	@Override
	public int deleteNotice(int noticeId) {
		// TODO Auto-generated method stub
		return sqlsession.delete("mapper.notice.deleteNotice", noticeId);
	}
	
	@Override
	public int modNotice(Map<String, Object> noticeMap) {
		// TODO Auto-generated method stub
		return sqlsession.update("mapper.notice.addNotice", noticeMap);
	}

}
