package hashmap1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_Ex2 {
	/*
	 * HashMap���� �������� �޼��� ���� �ִ�.
	 * 1. put : Ű�� ���� �ִ´�. Ű�� �ߺ������ �Ұ������� ���� �ߺ������ ���� [�ڡڡڡڡڡڡ�]
	 * 2. remove : ����, replace : ��ü
	 * 3. get : Ư�� Ű�� �Ἥ ���� �����´�. [�ڡڡڡڡڡڡ�]
	 * 4. containsKey() �ش� Ű�� ���� ���ԵǾ� �ִ���
	 * 5. containsValue() �ش� ���� ���ԵǾ� �ִ���
	 * 6. size() ���� ũ�⸦ ��Ÿ�� == length [map���� ���̸� ����� ���� size�� ����Ѵ�.]
	 * 7. isEmpty() ���� ����ִ��� Ȯ���� �� �ִ�.
	 * 
	 * Map�� Ű�� �������ǵ� �迭�̶�� �����ϸ� �ȴ�.
	 * 
	 */

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); // ����� �����Ƿ� ǥ�õȴ�.
		map.put(101, "��");
		map.put(201, "��");
		map.put(301, "��");
		map.replace(301,"��");
		
		System.out.println(map);
		
		boolean a = map.containsKey(501);
		boolean b = map.containsValue("��");
		// boolean => if else����밡��
		if (a == true) {
			System.out.println("�ִ�.");
		} else {
			System.out.println("����.");
		}
		
		map.put(101,"�ȳ�"); // Ű�� ���� �ߺ��� �ȵǱ� ������ "��"�� ��������.
		map.put(102, "�ȳ�"); // ���� �ߺ��� �����ϱ� ������ �� �� �ִ�.
		
		System.out.println(map);
		
		System.out.println(map.size()); // map�� ������ ��µȴ�.
		// for�� ���� ���� ��� List�� ����
		
		//map.clear(); // map�� ����ó����
		
		//System.out.println(map);
		
		//map.remove(101); // map�� Key���� �Է��ϸ� ������
		//System.out.println(map);
		
		System.out.println("key :" + 101 + " value :" + map.get(101)); // map.get�� ����Ҷ��� Ű ���� �������� ���� �ҷ��´�.
		System.out.println("key :" + 201 + " value :" + map.get(201));
		System.out.println("key :" + 301 + " value :" + map.get(301));
		System.out.println("key :" + 102 + " value :" + map.get(102));
			

	}

}
