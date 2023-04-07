package com.himes.diary.domain.users;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 정지회원 DTO (UsersDTO와 연결)
 * */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BnUsersDTO {
	
	private int bnNo;
	private int userNo;
	private Date bannDate;
	private int bannPeriod;
	
}
