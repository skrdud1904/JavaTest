package hashmap1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Ex3 {
	
	/*
	 * 1. map에 ID, PW를 받는다.
	 * 2. Hash map으로 받는다.
	 * 3. ID값이 일치하는지 않는지 찾는 프로그램 작성
	 */

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Admin", 1111);
		map.put("User", 1234);
		map.put("Cooper", 132611);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID를 입력해주세요 :");
			
			String a = sc.nextLine().trim(); // trim은 공백 제거
			
			System.out.println("PW를 입력해주세요 :");
			
			int b = sc.nextInt();
			
			if(!map.containsKey(a)) {
				System.out.println("해당 ID값이 존재하지 않습니다.");
				continue;
			}
			
			if((map.get(a)).equals(b)){
				System.out.println("패스워드가 일치하지 않습니다.");
			}
			else {
				System.out.println("로그인되었습니다.");
				break;
			}
					
		}
		

	}

}
