package list_Test;

import java.util.ArrayList;
import java.util.Collections;

public class List_Ex_1 {
	// Java에서는 Data를 정제, 전송하는 역할을 하는데
	// 개발자는 이 방식을 고민해야 한다.
	// 이 값이 어떻게 구성되어 있고 이 구성을 화면단에 뿌렸을 때 어떻게 출력이 되는지를 고민해야 한다.
	// List 배열에 담아서 값을 처리할 것인지?
	
	/*
	 * Collection Framework
	 * List(배열), set(집합, 키와 값으로 구성된), Map
	 * Collction interface Method 안에 List, Map이 있다.
	 * 개발하면서 set을 거의 사용하는 경우가 없다.
	 * = add(더하는것), contains, remove(제거), size(개수), toArray(Array안에서 새로운 Array생성)
	 * List에는 여러가지 List가 있는데 제일 많이 사용하는 것
	 * Array List, Linked List
	 * Array List - 그냥 배열
	 * Linked List - 순서가 있는 배열.
	 */

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		// list1.add(new Integer(5));
		// list1.add(new Integer(4));
		// list1.add(new Integer(3)); 정석적인 방법
		
		list1.add(5); // new Integer 생략가능
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
	
		// list는 대부분 하나의 형을 사용한다.
		// Array List는 하나의 형으로 많이 사용한다.
		// 두개의 형이 들어가기는 하지만 좋은 코드는 아니다.
		// 두개의 형을 사용하는 경우는 map을 사용한다.
		
		System.out.println(list1);
		
		/*
		 * 배열의 요소 꺼내기
		 * 배열의 요소는 for문으로 꺼낸다.
		 */
		
		for(int i = 0; i < list1.size(); i ++) {
			System.out.println(list1.get(i));
		}
		
		// subList 시작점부터 종료시점전까지 List 복사 (4,3,2)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		
		print(list1, list2);
		
		// Collection이라는 Class가 존재한다.
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);
		
		// containsAll : 반환하는 값이 boolean
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		// list1이 list2에 있는 값들을 포함하고 있는지
		System.out.println("4의 값이 존재하는지?: " + list1.contains(4));
		// contains 
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.add(3, "AA");
		print(list1, list2);

		// retainAll 겹치는 부분을 제외하고 나머지 부분을 지운다.
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제시킨다.
		
		System.out.println("list1.retainAll(list2)" + list1.retainAll(list2));
		print(list1, list2);
		
		// 객체 삭제(for문 사용)
		// list2에서 list1에 포함된 객체들을 삭제한다.
		// list 뒤에서부터 지우는 이유 => index의 개념이 들어감
		// 뒤에서 지우면 탐색 속도가 빨라짐.
		
		for(int i = list2.size() -1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		for(int i = 0; i < list2.size(); i++) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		// 다른 방식
		
		

	}
	
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
	}

}
