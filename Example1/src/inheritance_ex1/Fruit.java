package inheritance_ex1;

public class Fruit {
	//������, �ٳ��� Ŭ���� ����� main Ŭ������ ȣ�� => �������� ���
	
	String name;
	int price;
	int fresh;
	
	public void show() {
		System.out.println("���� �̸�: " + name);
		System.out.println("���� ����: " + price);
		System.out.println("���� �ż���: " + fresh);
	}
	
	

}

	class Banana extends Fruit {
		
		public Banana() {
			name = "Banana";
			price = 4500;
			fresh = 10;
		}
		
		
	}
	
	class Peach extends Fruit {
		public Peach() {
			name = "Peach";
			price = 2500;
			fresh = 10;
		}
	}
	
	
	
	