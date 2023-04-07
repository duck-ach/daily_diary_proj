package com.himes.diary.domain.users;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원 포인트 기록 DTO
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PointLogDTO {
	
	private int pointLogNo;
	private int userNo;
	private String pointLog;
	private Date pointLogDate;
	private int point;
}
