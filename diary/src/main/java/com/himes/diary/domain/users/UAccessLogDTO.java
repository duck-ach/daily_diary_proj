package com.himes.diary.domain.users;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원 접속기록 DTO
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UAccessLogDTO {
	
	private int acLogNo;
	private int userNo;
	private Date lastLoginDate;
	
}
