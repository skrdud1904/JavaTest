package hashmap1;

import java.util.HashMap;

public class HashMap_Ex1 {

	/* 
	 * Collection Frame work �� 3������ �ִ�.
	 * - List, Set, Map
	 * 1. List �迭�� ����� �ڷᱸ��
	 * 	List���� ������ �ְ� �ߺ��� �ȴ�.
	 * 
	 * 2. Set ���� - Java���� ���� ������� �ʴ´�. ���� �������µ� ������� ����.
	 *  ������ ���� �ߺ��� �ȵȴ�.
	 *  
	 * 3. Map
	 *  ������ ����, Ű�� �ߺ��ȵǰ�, ���� �ߺ��� �ȴ�.
	 *  Map�ȿ��� hash Table�� �ְ� hash map �� tree map, Linked Hash map�� �ִ�.
	 *  
	 *  Map���� ������ ����. ������ �ִ� map�� Linked hash map�̴�.
	 *  hash map���� Ű�� ���� �ִ�.
	 * 
	 * Collection Interface���� 2������ �ִ�.
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		// ���ο� Map�� ������ ��
		// Ű�� ���� ���ν�Ű�� ���� �ش�Ű�� ���� ����Ų��.
		
		HashMap<String, String> map = new HashMap<String, String>(); // �������� ��� K�� Key, V�� Value ������ �������� ����
		// HashMap map = new HashMap
		// map�� ���������ε� �� �ּҰ��� �ƴ϶� ���� ��µɱ�
		// Collection Frame work�� �ڵ������� ��ü�� �����ؼ� ���� �����ش�.
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("test", "1234");
		
		System.out.println(map);
	}

}
