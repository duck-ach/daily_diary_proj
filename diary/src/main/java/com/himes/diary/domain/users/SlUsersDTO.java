package com.himes.diary.domain.users;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 휴면 회원정보 DTO
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SlUsersDTO {
	
	private int slUserNo;
	private String userId;
	private String UserPw;
	private String name;
	private String nName;
	private String gender;
	private String email;
	private String mobile;
	private String birthday;
	private int agreeCode;
	private String snsType;
	private Date joinDate;
	private Date slDate;
	private String ip;	
	
}
