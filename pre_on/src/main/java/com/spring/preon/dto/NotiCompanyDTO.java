package com.spring.preon.dto;

import lombok.Data;

@Data
public class NotiCompanyDTO {
	// db의 채용공고 테이블과 회사 테이블의 컬럼을 합친 것
	int noticeId;
	String companyId;
	String pos;
	String money;
	String contents;
	String skill;
	
	String companyName;
	String companyCountry;
	String companyLocal;
}
