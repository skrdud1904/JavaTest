package inheritance_ex1;

import java.util.Scanner;

public class CallFruit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		number = sc.nextInt();
		
		if (number == 1) {
			Fruit fruit = new Banana();
			fruit.show();
		} else {
			Fruit fruit = new Peach();
			fruit.show();
		}

	}

}
