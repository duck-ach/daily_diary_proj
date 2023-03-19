package com.himes.diary.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DailyDTO {
	private int dNo;
	private int userNo;
	private String dTitle;
	private String dCont;
	private Date dDate;
	private Date dModyDate;
	private int dHit;
}
