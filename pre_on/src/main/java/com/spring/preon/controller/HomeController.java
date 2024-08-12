package com.spring.preon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public interface HomeController {
	//�������� ù ȭ��
	ModelAndView main();
	
	//ä����� ���
	ModelAndView listNotice();
	
	//ä����� �ۼ�
	void addNotice(HttpServletRequest request, HttpServletResponse response) throws Exception; 
	
	//ä����� �� ����
	ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//(������)ä����� �� ����
	ModelAndView detailNotice(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//(������)ä����� ����
	void deleteNotice(HttpServletRequest request, HttpServletResponse response) throws Exception;

	//(������)ä����� ����
//	void modNotice(HttpServletRequest request, HttpServletResponse response) throws Exception;

	


}
