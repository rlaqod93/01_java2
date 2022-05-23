package com.pcwk.ex02.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class URLConnectionEx02 {

	public static void main(String[] args) {
//		URLConnection
//		URLConnection은 어플리케이션과 URL간의 통신연결을 나타내는 클래스의 최상의 클래스
		URL url = null;
		String address = "http://sinchon.koreaisacademy.com/?dGubun=1&_ga=2.28977851.600780303.1646616004-285336498.1638953022";
		
		BufferedReader input = null;
		try {
			url = new URL(address);
			//버퍼(byte 스트림을 char(Inputstream));
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			String line = "";
			while( (line=input.readLine() )!=null) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		}try {
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
