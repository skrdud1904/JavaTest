package list_Test;

import java.util.ArrayList;

public class List_increment_ex1 {

	public static void main(String[] args) {
		
		// 배열을 지우는 방법 후위 연산자로 처리하는 이유?
		
		ArrayList list5 = new ArrayList();
			list5.add(1);
			list5.add(2);
			list5.add(3);
			list5.add(4);
			list5.add(5);
		
		System.out.println(list5);
		
		/*
		 * 후위 연산자로 처리하는 방법
		 * 다 지워짐
		
		for(int i=list5.size()-1; i>=0; i--) {
			list5.remove(i);
		}
		
		System.out.println(list5);
		
		*/
		
		for(int i=0; i<list5.size();i++) {
			list5.remove(i);
		}
		/*
		 * 1,3,5가 지워지기 때문에
		 */
		System.out.println(list5);

	}

}
