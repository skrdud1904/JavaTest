package hashmap1;

import java.util.HashMap;

public class HashMap_Ex1 {

	/* 
	 * Collection Frame work 총 3종류가 있다.
	 * - List, Set, Map
	 * 1. List 배열과 비슷한 자료구조
	 * 	List에는 순서가 있고 중복이 된다.
	 * 
	 * 2. Set 집합 - Java에서 많이 사용하지 않는다. 값을 가져오는데 어려움이 있음.
	 *  순서가 없고 중복이 안된다.
	 *  
	 * 3. Map
	 *  순서가 없고, 키는 중복안되고, 값은 중복이 된다.
	 *  Map안에는 hash Table이 있고 hash map 과 tree map, Linked Hash map이 있다.
	 *  
	 *  Map에는 순서가 없다. 순서가 있는 map은 Linked hash map이다.
	 *  hash map에는 키와 값이 있다.
	 * 
	 * Collection Interface에는 2종류가 있다.
	 * 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		// 새로운 Map을 선언할 때
		// 키와 값을 매핑시키기 위해 해당키가 값을 가르킨다.
		
		HashMap<String, String> map = new HashMap<String, String>(); // 정석적인 방식 K가 Key, V가 Value 들어오는 형에대한 정의
		// HashMap map = new HashMap
		// map은 참조변수인데 왜 주소값이 아니라 값이 출력될까
		// Collection Frame work는 자동적으로 객체를 생성해서 값을 보여준다.
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("test", "1234");
		
		System.out.println(map);
	}

}
