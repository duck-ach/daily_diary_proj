package com.himes.diary.domain.users;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원정보 DTO
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
	
	private int userNo;
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
	private String ssId;
	private Date ssLimitDate;
	private String ip;
	private Date pwModifyDate;
	
	
}
