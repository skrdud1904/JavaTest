package vo_test;
import java.util.Scanner;
public class Practice_Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		Practice_vo Ex_1 = new Practice_vo();
		
		
		System.out.println("���ڿ� ���� �Է����ּ���.");
		Ex_1.setTest(scan.next()); 
		
		System.out.println(Ex_1.toString());
	}

}
