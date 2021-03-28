package list_Test;

import java.util.ArrayList;

public class List_Ex_2 {
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
		

	}
	
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
	}

}
