package basic_test.test;

import java.util.Scanner;

/*
 * 콘솔에 사용자가 값을 입력하면 
 * 짝수 인지 홀수인지 구분하는 프로그램을 만들어 주세요 
 * (삼항 연산자 사용) 
 * 
 * 예시)
 * 숫자를 입력해 주세요 
 * 22
 * 출력값은 "짝수" 입니다.
 * 
 * 
 */
public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		System.out.println("값을 입력해주세요 : ");
		i=sc.nextInt();
		
		int x = i % 2;
		
		String a = "i의 값은 짝수입니다.";
		String b = "i의 값은 홀수입니다.";
		
		String c = x==0 ? "i의 값은 짝수입니다." : "i의 값은 홀수입니다.";
		
		System.out.println(c);

	}
	
}
