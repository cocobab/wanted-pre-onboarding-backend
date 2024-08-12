package com.spring.preon.dto;

import lombok.Data;

@Data
public class NoticeDTO {
	int noticeId;
	String companyId;
	String pos;
	String money;
	String contents;
	String skill;
}
