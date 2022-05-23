/**
* <pre>
* com.pcwk.util.ex01.calender
* Class Name : CalenderEx02Main.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.calender;
import java.util.*;

import com.pcwk.comn.LoggerManager;
public class CalendarEx02Main implements LoggerManager{
	
	//Calendar 사용
	
	public static void main(String[] args) {
		//get()메서드로 정보 가져오기
		Calendar today = Calendar.getInstance();
		//년도
		int year = today.get(Calendar.YEAR);
		
		//월 : 0~11(0->1월)
		//+1을 꼭 해줘야됨
		int month = today.get(Calendar.MONTH)+1;
		
		//일 
		int date = today.get(Calendar.DATE);
		
		LOG.debug("이혜의 년도: "+year);
		LOG.debug("월(0~11)월: "+month);
		LOG.debug("일: "+date);
		
		LOG.debug("=====================");
		LOG.debug(year+"년"+month+"월"+date+"일");
		
		//요일:1(일요일)~7(토요일)
		int week = today.get(Calendar.DAY_OF_WEEK);
		LOG.debug("요일:1(일요일)~7(토요일):"+week);
		
		//오전,오후
		//(오전:0 , 오후:1)
		LOG.debug(today.get(Calendar.AM_PM));
		
		//시간(0~11)
		LOG.debug("시간(0~11):"+today.get(Calendar.HOUR));
		//시간(0~23)
		LOG.debug("시간(0~23):"+today.get(Calendar.HOUR_OF_DAY));
		
		//분(0~59)
		LOG.debug("분(0~59):"+today.get(Calendar.MINUTE));
		
		//초(0~59)
		LOG.debug("초(0~59):"+today.get(Calendar.SECOND));
		
		//1000분의 1초
		LOG.debug("1000분의 1초:"+today.get(Calendar.MILLISECOND));
		
		LOG.debug("====================");
		
		LOG.debug(year+"년"+month+"월"+date+"일"+" "+today.get(Calendar.HOUR)+":"
		+today.get(Calendar.MINUTE)+":"+
		today.get(Calendar.SECOND));
		
		
		
	}

}