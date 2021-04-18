package tryCatch;

public class TryCatch_ex2 {

	/*
	 * public static void main(String[] args) {
	
		System.out.println(1); // try Catch에 안적는 것 Logger, Scanner같은 생성자들은 논외
		
		try { // 논리적으로 처리해야 되는부분을 try~catch문에 사용한다.
			System.out.println(2);
			System.out.println(3);
		}
		catch (Exception e) { // try에서 문제가 발생해야지 catch로 예외가 떨어진다.
			System.out.println(4);
		}
		System.out.println(5);

	}
	*/
	
	// -----------------------------------------------------------------------
	
	/*
	  public static void main(String[] args) {
	 
		System.out.println(1);
		
		try {
			System.out.println(0/0);
			System.out.println(2);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(3);
			// 빨간글자로 나오는 것이 printStackTrace임. 만일 없을 경우에는 오류가 표시되지 않음.
			// 더정확한 Try ~ Catch문을 사용해서 오류 검증
		}
		
		System.out.println(4);
	}
	*/
	
	// 일치하는 Exception이 존재하지 않으면 에러처리가 발생하지 않는다. 그래서 Exception e로 퉁친다. 
	// -----------------------------------------------------------------------
	
	/*
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(args[0]);
			System.out.println(4);
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) // 해당에러가 발생하지 않음
				System.out.println("true");
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("ArrayIndexOutOfBoundsException"); // 다시 해당 에러를 잡아줘야 하는 번거로움이 있음.
		}
		
		// e.printstacktrace - 오류 검증을 위해 필수로 필요한 코드.
		
		System.out.println(5);
	}
	*/
	
	// -----------------------------------------------------------------------
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println();
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage()); // 뒷단의 Error를 Method에 담아서 앞단에서 볼 때 사용한다.
		}
		
		System.out.println(5);
	}
	
	

}
