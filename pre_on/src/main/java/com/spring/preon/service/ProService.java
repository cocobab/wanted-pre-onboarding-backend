package com.spring.preon.service;

import java.util.List;
import java.util.Map;

import com.spring.preon.dto.NotiCompanyDTO;
import com.spring.preon.dto.NoticeDTO;

public interface ProService {

	//����Ŭ ������ ��������
	String bringData();

	// ���ο� ä����� ���
	int addNotice(Map<String, Object> noticeMap); 
	
	//ä����� ���
	List<NotiCompanyDTO> listNotice(); 
	
	//ä����� ��
	NotiCompanyDTO selectDatail(int noticeId);

	//ä����� ����
	int deleteNotice(int noticeId);

	//ä����� ����
	int modNotice(Map<String, Object> noticeMap);

}
