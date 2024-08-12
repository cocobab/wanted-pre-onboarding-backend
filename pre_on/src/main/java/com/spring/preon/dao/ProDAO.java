package com.spring.preon.dao;

import java.util.List;
import java.util.Map;

import com.spring.preon.dto.NotiCompanyDTO;

public interface ProDAO {

	//오라클 데이터 가져오기
	String bringData();
	
	//새로운 채용공고 등록
	int addNotice(Map<String, Object> noticeMap); 
	
	//채용공고 목록
	List<NotiCompanyDTO> listNotice(); 
	
	//채용공고 상세
	NotiCompanyDTO selectDetail(int noticeId);
	
	//채용공고 삭제
	int deleteNotice(int noticeId);
	
	//채용공고 수정
	int modNotice(Map<String, Object> noticeMap);
	
}
