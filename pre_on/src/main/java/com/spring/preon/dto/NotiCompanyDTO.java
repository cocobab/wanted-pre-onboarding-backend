package com.spring.preon.dto;

import lombok.Data;

@Data
public class NotiCompanyDTO {
	// db�� ä����� ���̺�� ȸ�� ���̺��� �÷��� ��ģ ��
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
