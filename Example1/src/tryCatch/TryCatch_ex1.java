package tryCatch;

public class TryCatch_ex1 {
	/*
	 * try~catch���� �����ڰ� ���� ����ó�� ���� �ڵ��� �ϳ���.
	 * �� ������ ��� ��� ����̵簣�� ������ ���� �Ѵ�.
	 * �����ϸ鼭 ���� �߿��� �� -> ������ ������ �� ������ �ذ��ؾ� �Ѵ�. (Perfomance�� �ȳ����� ������ �ȴ�.)
	 * ��𿡼� ������ ������ ��ġ������ �˾ƾ� �Ѵ�.
	 * Array ���� �ѱ�, Null�� Check
	 * ����ó���� ����?
	 * - ���α׷� ����� �߻��� �� �ִ� ������ �߻��� ����Ͽ� Code�� �ۼ��Ѵ�.
	 * ���α׷� ���߽� ������ ������ �߻����� ���? Try~Catch���� ��� -> Program ����� �߻��� �� �ִ� ���ܸ� ����Ͽ� Code�� �ۼ��Ѵ�.
	 * ���α׷��� ���������� ���Ḧ ���� ���� �����Ѵ�.
	 * 1. Complie ����
	 * 2. Runtime ����
	 * 3. ������ ����
	 * 
	 * ��κ� �´� ������ Runtime Error�̴�. ����, Exception Error
	 * Exception Error - ũ�� ġ�������� ���� ������ Exception Error��� �Ѵ�.
	 * ��Null Point Error - Parameter���� Null���� ������ ����
	 * 	1. SQL�������� ����.(���� ���� �ɸ�)
	 *  2. �������� Ȯ���Ѵ�.
	 *  3. ������ Parameter�� Type�� Ȯ���Ѵ�. VarChar
	 *     ���������� Type�� Ȯ���� �ؾ� �Ѵ�.
	 */
	
	public static void main(String[] args) {
		
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
			// Exception�� ���� �ֻ��� Ŭ�����̴�. �ٸ��̸��� ��� ������ ��κ� Exception(e)�� ����Ѵ�.
			// Exception(e)�� ����ϴ� ����? ���� Exception�� �ϳ��� Exception�� �ɸ��� �ϱ� ���ؼ�
			// ���������δ� �ɾ���� �Ѵ�.
			// e.printtrace�� �� �� ������ e���� �ٸ����� ������� �ʴ´�.
			// try���� ������ �߻��ϸ� �̸� ó���� e�� ó���� catch������ java�� ��������.
			// catch���� 2������ �ִ�.
			// printstacktrace : �����߻���� ȣ�� Stack�� �־��� �޼���� ������ ���(�ܼ�â)
			// GetMessage : �߻��� ���� Ŭ������ �ν��Ͻ��� ����� Message�� �� �� �ִ�. ���� �� �ִ�. JSON�Լ� ȣ���� �� ����Ѵ�.
			// IF���� ������ try ~ catch�� ������ ����ó���ؾ��Ѵ�. ������ó���ؾ���.
		}
		
	}

