package loop;

import java.util.Scanner;

import javax.xml.transform.Result;

public class Q05_02 {

	public static void main(String[] args) {
//		Q2.두수를 입력받아 사칙 연산을 수행하는 프로그램을 작성 하세요.
//		(입력은 int로 받으세요 switch-case문으로 작성하세요.)
		System.out.print("num1을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		
		int num1 = scanner.nextInt();
		System.out.println("num2를 입력하세요:");
		int num2 = scanner.nextInt();
		
		String operator = "+";//연산자
		double result = 0;//연산결과
		//연산자를 선언할때는 operator(문자형이니 String)로 선언
		//연산결과는 result로 선언
		
		System.out.println("연산기호를 입력 하세요:");
		// nextLine() : 위쪽 Enter에 영향을 받음.
		// ->next()로 변경
		operator = scanner.next();
		
		switch(operator){
		case"+": // case를 사용할때는 마지막에 :로 선언
			result = num1 + num2;
			break;
		case"-":
			result = num1 + num2;
			break;
		case"*":
			result = num1 + num2;
			break;
		case"/":
			result = num1 + num2;
			break;
		default://case가 끝나면 디폴트로 마무리 디폴드도 마지막은:로 선언
			System.out.println(num1+(""+operator)+num2+"="+result);
		}
		
	}

}