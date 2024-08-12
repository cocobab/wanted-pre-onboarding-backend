package com.spring.preon.controller;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.preon.dto.NotiCompanyDTO;
import com.spring.preon.service.ProService;

@Controller
public class HomeControllerImpl implements HomeController{

	@Autowired
	ProService service;

	@Override
	@RequestMapping(value = {"/", "/main"}, method = RequestMethod.GET)
	public ModelAndView main(){
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView("main");
		return mav;
	}

	@Override
	@RequestMapping(value = "/list")
	public ModelAndView listNotice() {
		// TODO Auto-generated method stub

		ModelAndView mav = new ModelAndView("list");
		List<NotiCompanyDTO> noticeList = service.listNotice();
		mav.addObject("list", noticeList);
		return mav;
	}

	@Override
	@RequestMapping("/*Form*")
	public ModelAndView 
	form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView mav = new ModelAndView("noticeForm");
		System.out.println("modForm의 noticeId: "+request.getParameter("noticeId"));
		
		if(request.getParameter("noticeId")!=null) {
			Integer noticeId = Integer.parseInt(request.getParameter("noticeId"));
			NotiCompanyDTO detail = service.selectDatail(noticeId);
			System.out.println("detail(NotiCompanyDTO)객체: "+detail);


			mav.addObject("detail", detail);
			
		}
		
		return mav;
	}

	@Override
	@RequestMapping(value = "/addNotice", method=RequestMethod.POST)
	public void addNotice (HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub

		request.setCharacterEncoding("utf-8");
		Map<String, Object> noticeMap = new HashMap<String, Object>();
		System.out.println("companyId:"+request.getParameter("companyId"));
		
		noticeMap.put("companyId", request.getParameter("companyId"));
		noticeMap.put("pos", request.getParameter("pos"));
		noticeMap.put("money", request.getParameter("money"));
		noticeMap.put("contents", request.getParameter("contents"));
		noticeMap.put("skill", request.getParameter("skill"));


		Integer num = service.addNotice(noticeMap);
		String message = null;
		if(num==1) {
			message = "<script>";
			message += "alert('채용공고를 등록했습니다.');";
			message += "location.href='/preon/main';";
			message += "</script>";
		}else {
			message = "<script>";
			message += "alert('오류가 발생했습니다. 다시 시도해 주세요.');";
			message += "location.href='/preon/addNotice';";
			message += "</script>";
		}
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.write(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}


	@Override
	@RequestMapping("/detail*")
	public ModelAndView 
	detailNotice(HttpServletRequest request, HttpServletResponse response) throws Exception  {
		// TODO Auto-generated method stub
		ModelAndView mav = new ModelAndView("detailNotice");
		Integer noticeId = Integer.parseInt(request.getParameter("noticeId"));
		
		Map<String, Object> noticeMap = new HashMap<String, Object>();
		noticeMap.put("pos", request.getParameter("pos"));
		noticeMap.put("money", request.getParameter("money"));
		noticeMap.put("contents", request.getParameter("contents"));
		noticeMap.put("skill", request.getParameter("skill"));

		String message = null;
		if(noticeId!=0) {
			NotiCompanyDTO detail = service.selectDatail(noticeId);
			mav.addObject("detail", detail); //채용공고 상세사항 내용이 있는 DTO jsp로 보내서 출력
		}else {
			message = "<script>";
			message += "alert('오류가 발생했습니다. 다시 시도해 주세요.');";
			message += "location.href='/preon/list';";
			message += "</script>";
		}
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.write(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return mav;
	}

	@Override
	@RequestMapping("/delete*")
	public void 
	deleteNotice(HttpServletRequest request, HttpServletResponse response) throws Exception  {
		System.out.println("noticeId: "+request.getParameter("noticeId"));
		Integer noticeId = Integer.parseInt(request.getParameter("noticeId"));
		
		Integer num = service.deleteNotice(noticeId);
		String message = null;
		if(num==1) {
			message = "<script>";
			message += "alert('채용공고를 삭제했습니다.');";
			message += "location.href='/preon/list';";
			message += "</script>";
		}else {
			message = "<script>";
			message += "alert('오류가 발생했습니다. 다시 시도해 주세요.');";
			message += "location.href='/preon/detail?noticeId='"+noticeId+";";
			message += "</script>";
		}
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.write(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
//	@Override
	@RequestMapping(value = "/modNotice", method=RequestMethod.POST)
	public void modNotice (HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		Map<String, Object> noticeMap = new HashMap<String, Object>();
		
		int noticeId = Integer.parseInt(request.getParameter("noticeId"));
		String pos = request.getParameter("pos");
		String money = request.getParameter("money");
		String contents = request.getParameter("contents");
		String skill = request.getParameter("skill");
		
		System.out.println("modNotice의 noticeId: "+noticeId);
		System.out.println("modNotice의 pos: "+ pos);
		System.out.println("modNotice의 money: "+ money);
		System.out.println("modNotice의 contents: "+ contents);
		System.out.println("modNotice의 skill: "+ skill);

		noticeMap.put("noticeId", noticeId);
		noticeMap.put("pos", pos);
		noticeMap.put("money", money);
		noticeMap.put("contents", contents);
		noticeMap.put("skill", skill);

		Integer num = service.modNotice(noticeMap);
		
		String message = null;
		if(num==1) {
			message = "<script>";
			message += "alert('채용공고를 수정했습니다.');";
			message += "location.href='/preon/detail?noticeId="+noticeId+"';";
			message += "</script>";
		}else {
			message = "<script>";
			message += "alert('오류가 발생했습니다. 다시 시도해 주세요.');";
			message += "location.href='/preon/detail?noticeId="+noticeId+"';";
			message += "</script>";
		}
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.write(message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
