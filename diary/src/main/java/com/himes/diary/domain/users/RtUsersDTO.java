package com.himes.diary.domain.users;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 탈퇴 회원정보 DTO
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RtUsersDTO {
	
	private int rtUserNo;
	private String userId;
	private String email;
	private Date rtDate;
	
}
