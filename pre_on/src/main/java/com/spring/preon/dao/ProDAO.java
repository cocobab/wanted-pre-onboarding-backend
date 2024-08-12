package com.spring.preon.dao;

import java.util.List;
import java.util.Map;

import com.spring.preon.dto.NotiCompanyDTO;

public interface ProDAO {

	//����Ŭ ������ ��������
	String bringData();
	
	//���ο� ä����� ���
	int addNotice(Map<String, Object> noticeMap); 
	
	//ä����� ���
	List<NotiCompanyDTO> listNotice(); 
	
	//ä����� ��
	NotiCompanyDTO selectDetail(int noticeId);
	
	//ä����� ����
	int deleteNotice(int noticeId);
	
	//ä����� ����
	int modNotice(Map<String, Object> noticeMap);
	
}
