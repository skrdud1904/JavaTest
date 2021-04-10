package inheritance_ex1;

public class Fruit {
	//복숭아, 바나나 클래스 만들고 main 클래스에 호출 => 다형성을 출력
	
	String name;
	int price;
	int fresh;
	
	public void show() {
		System.out.println("과일 이름: " + name);
		System.out.println("과일 가격: " + price);
		System.out.println("과일 신선도: " + fresh);
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
	
	
	
	