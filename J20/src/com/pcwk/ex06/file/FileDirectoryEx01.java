/**
* <pre>
* com.pcwk.ex06.file
* Class Name : FileDiretoryEx01.java
* Description:
* Author: ITSC
* Since: 2022/03/03
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/03/03 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex06.file;

import java.io.File;
import java.io.IOException;

public class FileDirectoryEx01 {

	/**
	 * File API
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		String filePath="C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file\\FileDiretoryEx01.bak";
		
		//파일객체 생성
		//File file = new File(filePath);
		//File file = new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file","FileDiretoryEx01.bak");
		File dir = new File("C:\\DCOM_20220127\\01_JAVA\\workspace\\J20\\src\\com\\pcwk\\ex06\\file");
		File file = new File(dir, "FileDiretoryEx01.bak");
		
		//신규파일 생성 - 두가지로 새로운 파일을 만들 수 있음
		file.createNewFile();
//		boolean flag = file.createNewFile();
//		System.out.println("신규파일 생성:"+flag);
		
		//File객체는 파일과 디렉토리를 처리
		System.out.println("파일의 여부:"+file.isFile());//파일의 여부:true
		
		System.out.println("디렉토리 여부:"+file.isDirectory());//디렉토리 여부:false
		
		System.out.println("경로를 제외한 파일명:"+file.getName());//경로를 제외한 파일명:FileDiretoryEx01.bak
		
		System.out.println("파일이 속해 있는 디렉토리:"+file.getParent());
		//파일이 속해 있는 디렉토리:C:\DCOM_20220127\01_JAVA\workspace\J20\src\com\pcwk\ex06\file
		
		System.out.println("파일에 절대 경로:"+file.getAbsolutePath());
		//파일에 절대 경로:C:\DCOM_20220127\01_JAVA\workspace\J20\src\com\pcwk\ex06\file\FileDiretoryEx01.bak
		
		//OS별 path Separator 중요!
		System.out.println("path Separator:"+file.pathSeparator);//path Separator:;
		System.out.println("path separator:"+file.separator);//path separator:\
		System.out.println("===============================================");
		System.out.println("파일 read:"+file.canRead());//파일 read:true
		System.out.println("파일 write:"+file.canWrite());//파일 write:true
		System.out.println("파일 실행:"+file.canExecute());//파일 실행:true
		
		
	}

}
