package hashmap1;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Ex3 {
	
	/*
	 * 1. map�� ID, PW�� �޴´�.
	 * 2. Hash map���� �޴´�.
	 * 3. ID���� ��ġ�ϴ��� �ʴ��� ã�� ���α׷� �ۼ�
	 */

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Admin", 1111);
		map.put("User", 1234);
		map.put("Cooper", 132611);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID�� �Է����ּ��� :");
			
			String a = sc.nextLine().trim(); // trim�� ���� ����
			
			System.out.println("PW�� �Է����ּ��� :");
			
			int b = sc.nextInt();
			
			if(!map.containsKey(a)) {
				System.out.println("�ش� ID���� �������� �ʽ��ϴ�.");
				continue;
			}
			
			if((map.get(a)).equals(b)){
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
			}
			else {
				System.out.println("�α��εǾ����ϴ�.");
				break;
			}
					
		}
		

	}

}
