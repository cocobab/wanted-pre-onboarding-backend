package com.spring.preon.service;

import java.util.List;
import java.util.Map;

import com.spring.preon.dto.NotiCompanyDTO;
import com.spring.preon.dto.NoticeDTO;

public interface ProService {

	//오라클 데이터 가져오기
	String bringData();

	// 새로운 채용공고 등록
	int addNotice(Map<String, Object> noticeMap); 
	
	//채용공고 목록
	List<NotiCompanyDTO> listNotice(); 
	
	//채용공고 상세
	NotiCompanyDTO selectDatail(int noticeId);

	//채용공고 삭제
	int deleteNotice(int noticeId);

	//채용공고 수정
	int modNotice(Map<String, Object> noticeMap);

}
