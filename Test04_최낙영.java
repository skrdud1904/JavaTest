package basic_test.test;

import java.util.Scanner;

public class Test04 {

	/*
	 * 콘솔에 사용자가 값을 입력하면 
	 * 두개의 합을 출력해주는 프로그램을 만들어 주세요 ^^ 
	 * 
	 * 예시)
	 * A값을 입력하세요 : 15
	 * B값을 입력하세요 : 10
	 * 15+10 = 25
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A값을 입력하세요 : ");
		A = sc.nextInt();
		System.out.println("B값을 입력하세요 : ");
		B = sc.nextInt();
		
		System.out.println("A와 B의 값의 합은 " + (A + B) + " 입니다.");

	}

}
