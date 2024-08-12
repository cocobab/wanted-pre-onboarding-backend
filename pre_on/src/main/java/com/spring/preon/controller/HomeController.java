package com.spring.preon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface HomeController {
	//웹페이지 첫 화면
	ModelAndView main();
	
	//채용공고 목록
	ModelAndView listNotice();
	
	//채용공고 작성
	void addNotice(HttpServletRequest request, HttpServletResponse response) throws Exception; 
	
	//채용공고 폼 띄우기
	ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//(선택한)채용공고 상세 보기
	ModelAndView detailNotice(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//(선택한)채용공고 삭제
	void deleteNotice(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//(선택한)채용공고 수정
//	void modNotice(HttpServletRequest request, HttpServletResponse response) throws Exception;

	


}
