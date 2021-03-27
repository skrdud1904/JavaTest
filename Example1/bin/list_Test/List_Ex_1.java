package list_Test;

import java.util.ArrayList;
import java.util.Collections;

public class List_Ex_1 {
	// Java������ Data�� ����, �����ϴ� ������ �ϴµ�
	// �����ڴ� �� ����� ����ؾ� �Ѵ�.
	// �� ���� ��� �����Ǿ� �ְ� �� ������ ȭ��ܿ� �ѷ��� �� ��� ����� �Ǵ����� ����ؾ� �Ѵ�.
	// List �迭�� ��Ƽ� ���� ó���� ������?
	
	/*
	 * Collection Framework
	 * List(�迭), set(����, Ű�� ������ ������), Map
	 * Collction interface Method �ȿ� List, Map�� �ִ�.
	 * �����ϸ鼭 set�� ���� ����ϴ� ��찡 ����.
	 * = add(���ϴ°�), contains, remove(����), size(����), toArray(Array�ȿ��� ���ο� Array����)
	 * List���� �������� List�� �ִµ� ���� ���� ����ϴ� ��
	 * Array List, Linked List
	 * Array List - �׳� �迭
	 * Linked List - ������ �ִ� �迭.
	 */

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		// list1.add(new Integer(5));
		// list1.add(new Integer(4));
		// list1.add(new Integer(3)); �������� ���
		
		list1.add(5); // new Integer ��������
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		
	
		// list�� ��κ� �ϳ��� ���� ����Ѵ�.
		// Array List�� �ϳ��� ������ ���� ����Ѵ�.
		// �ΰ��� ���� ����� ������ ���� �ڵ�� �ƴϴ�.
		// �ΰ��� ���� ����ϴ� ���� map�� ����Ѵ�.
		
		System.out.println(list1);
		
		/*
		 * �迭�� ��� ������
		 * �迭�� ��Ҵ� for������ ������.
		 */
		
		for(int i = 0; i < list1.size(); i ++) {
			System.out.println(list1.get(i));
		}
		
		// subList ���������� ������������� List ���� (4,3,2)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		
		print(list1, list2);
		
		// Collection�̶�� Class�� �����Ѵ�.
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);
		
		// containsAll : ��ȯ�ϴ� ���� boolean
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));
		// list1�� list2�� �ִ� ������ �����ϰ� �ִ���
		System.out.println("4�� ���� �����ϴ���?: " + list1.contains(4));
		// contains 
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");
		print(list1, list2);
		
		list2.add(3, "AA");
		print(list1, list2);

		// retainAll ��ġ�� �κ��� �����ϰ� ������ �κ��� �����.
		// list1���� list2�� ��ġ�� �κи� ����� �������� ������Ų��.
		
		System.out.println("list1.retainAll(list2)" + list1.retainAll(list2));
		print(list1, list2);
		
		// ��ü ����(for�� ���)
		// list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		// list �ڿ������� ����� ���� => index�� ������ ��
		// �ڿ��� ����� Ž�� �ӵ��� ������.
		
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
		// �ٸ� ���
		
		

	}
	
	static void print(ArrayList list1, ArrayList list2){
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
		
	}

}
