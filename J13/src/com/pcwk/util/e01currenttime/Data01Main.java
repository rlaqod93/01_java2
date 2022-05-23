/**
* <pre>
* com.pcwk.util.e01currenttime
* Class Name : Data01Main.java
* Description:
* Author: ITSC
* Since: 2022/02/21
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/21 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.e01currenttime;

import com.pcwk.comn.LoggerManager;

public class Data01Main implements LoggerManager {
// System.currentTimeMills();
// 현재 운영체제의 시각을 long타입으로 변환(1970.01.01기준으로 현재까지의 경과 시간 1/1000초까지 단위 환산
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		LOG.debug("시작시간: " + start);

		for (int i = 1; i < 10000000; i++) {
			for (int j = 1; j < 10000000; j++) {

			}
		}

		long end = System.currentTimeMillis();
		LOG.debug("종료시간: " + end);
		LOG.debug("경과시간: " + (end - start) + "ms");

	}

}
//  - 시작시간: 1645414841577
//	- 종료시간: 1645414841638
//	- 경과시간: 61ms
