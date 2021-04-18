package tryCatch;

public class TryCatch_ex2 {

	/*
	 * public static void main(String[] args) {
	
		System.out.println(1); // try Catch�� ������ �� Logger, Scanner���� �����ڵ��� ���
		
		try { // �������� ó���ؾ� �Ǵºκ��� try~catch���� ����Ѵ�.
			System.out.println(2);
			System.out.println(3);
		}
		catch (Exception e) { // try���� ������ �߻��ؾ��� catch�� ���ܰ� ��������.
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
			// �������ڷ� ������ ���� printStackTrace��. ���� ���� ��쿡�� ������ ǥ�õ��� ����.
			// ����Ȯ�� Try ~ Catch���� ����ؼ� ���� ����
		}
		
		System.out.println(4);
	}
	*/
	
	// ��ġ�ϴ� Exception�� �������� ������ ����ó���� �߻����� �ʴ´�. �׷��� Exception e�� ��ģ��. 
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
			if(ae instanceof ArithmeticException) // �ش翡���� �߻����� ����
				System.out.println("true");
				System.out.println("ArithmeticException");
		} catch (ArrayIndexOutOfBoundsException ab) {
			System.out.println("ArrayIndexOutOfBoundsException"); // �ٽ� �ش� ������ ������ �ϴ� ���ŷο��� ����.
		}
		
		// e.printstacktrace - ���� ������ ���� �ʼ��� �ʿ��� �ڵ�.
		
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
			System.out.println(e.getMessage()); // �޴��� Error�� Method�� ��Ƽ� �մܿ��� �� �� ����Ѵ�.
		}
		
		System.out.println(5);
	}
	
	

}
