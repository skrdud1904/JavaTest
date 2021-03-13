package basic_test.test;

import java.util.Arrays;

public class Test06 {
	// 두배열이 같은지 출력하는 코드를 작성해 주세요 
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		
		System.out.println(Arrays.equals(arr1, arr2));
		
		// System.out.println(arr1.equals(arr2));
		
		
		/* 
		 * java 언어에서 배열을 비교하려면 (Arrays.equals) Method를 사용하면 된다.
		 * 배열의 equals 메소드는 배열 내용이 아니라 배열 참조를 비교하므로 정확한 결과를 얻을 수 없다.
		 * 위는 배열의 equals Method 및 Arrays.equals Method를 사용한 예제이다.
		 */

		
	}
}
