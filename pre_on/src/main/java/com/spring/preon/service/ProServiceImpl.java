package com.spring.preon.service;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.preon.dao.ProDAO;
import com.spring.preon.dto.NotiCompanyDTO;

@Service
public class ProServiceImpl implements ProService{
	
	@Autowired
	private ProDAO dao;

	@Override
	//test¿ë
	public String bringData() {
		// TODO Auto-generated method stub
		return dao.bringData();
	}

	@Override
	public int addNotice(Map<String, Object> noticeMap) {
		// TODO Auto-generated method stub
		return dao.addNotice(noticeMap);
	}

	@Override
	public List<NotiCompanyDTO> listNotice() {
		// TODO Auto-generated method stub
		return dao.listNotice();
	}
	
	@Override
	public NotiCompanyDTO selectDatail(int noticeId) {
		// TODO Auto-generated method stub
		return dao.selectDetail(noticeId);
	}
	
	@Override
	public int deleteNotice(int noticeId) {
		// TODO Auto-generated method stub
		return dao.deleteNotice(noticeId);
	}

	@Override
	public int modNotice(Map<String, Object> noticeMap) {
		// TODO Auto-generated method stub
		return dao.modNotice(noticeMap);
	}


}
