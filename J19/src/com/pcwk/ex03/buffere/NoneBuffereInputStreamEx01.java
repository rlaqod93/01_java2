/**
* <pre>
* com.pcwk.ex03.bufferedinputstream
* Class Name : BufferedInputStreamEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/02
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/02 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex03.buffere;

import java.io.*;

public class NoneBuffereInputStreamEx01 {

	public static void main(String[] args) {
		
		String filePath ="C:\\DCOM_20220127\\01_JAVA\\workspace\\J19\\big_output03.txt";
		System.out.println("filePath:"+filePath);
		
		long start = System.currentTimeMillis();
				
		
		
		try(FileInputStream fis = new FileInputStream(filePath)){
			
			int data = 0;
			while( (data =fis.read())!=-1) {
				char ch =(char)data;
				System.out.print(ch);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("========================");
		System.out.println("경과시간:"+(end-start)+"ms");
		System.out.println("종료");
		System.out.println("========================");
		
		
	}

}
