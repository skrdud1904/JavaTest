package hashmap1;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap_Ex2 {
	/*
	 * HashMap에는 여러가지 메서드 들이 있다.
	 * 1. put : 키와 값을 넣는다. 키는 중복허용이 불가하지만 값은 중복허용이 가능 [★★★★★★★]
	 * 2. remove : 삭제, replace : 교체
	 * 3. get : 특정 키를 써서 값을 가져온다. [★★★★★★★]
	 * 4. containsKey() 해당 키의 값이 포함되어 있는지
	 * 5. containsValue() 해당 값이 포함되어 있는지
	 * 6. size() 앱의 크기를 나타냄 == length [map에서 길이를 출력할 때는 size를 사용한다.]
	 * 7. isEmpty() 맵이 비어있는지 확인할 수 있다.
	 * 
	 * Map을 키와 값이정의된 배열이라고 생각하면 된다.
	 * 
	 */

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>(); // 선언된 순서되로 표시된다.
		map.put(101, "안");
		map.put(201, "녕");
		map.put(301, "하");
		map.replace(301,"세");
		
		System.out.println(map);
		
		boolean a = map.containsKey(501);
		boolean b = map.containsValue("세");
		// boolean => if else문사용가능
		if (a == true) {
			System.out.println("있다.");
		} else {
			System.out.println("없다.");
		}
		
		map.put(101,"안녕"); // 키의 값이 중복이 안되기 때문에 "안"이 없어진다.
		map.put(102, "안녕"); // 값은 중복이 가능하기 때문에 들어갈 수 있다.
		
		System.out.println(map);
		
		System.out.println(map.size()); // map의 갯수가 출력된다.
		// for문 쓸때 많이 사용 List도 동일
		
		//map.clear(); // map을 공백처리함
		
		//System.out.println(map);
		
		//map.remove(101); // map의 Key값을 입력하면 지워짐
		//System.out.println(map);
		
		System.out.println("key :" + 101 + " value :" + map.get(101)); // map.get을 사용할때는 키 값을 가져오면 값을 불러온다.
		System.out.println("key :" + 201 + " value :" + map.get(201));
		System.out.println("key :" + 301 + " value :" + map.get(301));
		System.out.println("key :" + 102 + " value :" + map.get(102));
			

	}

}
