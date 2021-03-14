package string;

public class String_Ex2 {
	
	/* 
	 * String�� �ϳ��� Class�̰� ���ڿ��̶� ������ �����̴�.
	 * �ڹٿ��� String Class�� Char�� �迭�̰� Method���� �����̴�.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "�ȳ� ";
		String b = "���� �ֳ����̾�";
		
		a = a + b;
		
		System.out.println(a);
		
		String str1 = "abc"; // ���ڿ� ���ͷ� "abc"�� �ּҰ� str1 �������
		String str2 = "abc"; // ���ڿ� ���ͷ� "abc"�� �ּҰ� str2 �������
		
		String str3 = new String("abc"); // ���ο� String �ν��Ͻ��� ����
		String str4 = new String("abc"); // ���ο� String �ν��Ͻ��� ����
		
		if(str1 == str2) {
			System.out.println("str1�� str2�� ����");
		}
		else {
			System.out.println("str1�� str2�� �ٸ���");
		}
		
		if(str3 == str4) {
			System.out.println("str1�� str2�� ����");
		}
		else {
			System.out.println("str1�� str2�� �ٸ���");
		}
		
		// (3) ���ڿ� �ʱ�ȭ
		String str = "";
		
		// (4) String�� �޼���, equals ������ �߿�
		
		String s ="hello";
		String k = "Hello";
		boolean d = s.equals("hello");
		boolean f = s.equals("Hello");
	
		if(s.equals(k)) {
			System.out.println("�ΰ��� ����");
		}else {
			System.out.println("�ΰ��� �ٸ���");
		}
		
		// (5) index of ��ȯ�ϴ� Method => int���� ��ȯ
		
		String t = "hello";
		int idx1 = t.indexOf('o');
		int idx2 = t.indexOf('k');
		
		System.out.println(idx1);
		System.out.println(idx2);
		// index of idx1<0 => ���ڰ� �������� �ʴ´�.
		
		if(idx2 < 0) {
			System.out.println("��ġ�ϴ� ���ڴ� �������� �ʽ��ϴ�.");
		} else {
			System.out.println("��ġ�ϴ� ���ڴ� �����մϴ�.");
		}
		
		String g = "ABCDEFG";
		
		int idx = g.indexOf("CD");
		
		System.out.println(idx);
		
		// last Index of �ڿ������� Ž��
		// �����ʿ��� �������� ���� Ž��
		// ��ȯ�ϴ� Type�� int type
		
		String p ="java.lang.Object";
		int index1 = p.lastIndexOf('.');
		int index2 = p.indexOf('.');
		
		System.out.println(index1); // 9�� ��µǴ� ����? 15���� �ڷ� ī����
		System.out.println(index2);
		
		// length ���� String�� ���̸� ���
		
		String o = "abcdefg";
		int length = o.length();
		
		System.out.println(length);
		
		//(6) Split ¥���� ���
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		// �迭�� ����� ���� for���� ����ϸ� �ȴ�.
		// ���� for��? for each��
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (String brr : arr) { // arr�� �迭�� ���� brr�� ���������� ����ϸ�ȴ�. for-each�� ������ ���� ����Ѵ�.
			System.out.println(brr); // �߿� : ���� for��
		}
		
		//(7) SubString �� ��°���� �� ��°���� ¥�� ������ ����
		
		String i = "java.lang.object";
		String c = i.substring(10); // �߸� �������� ��ȯ 10��°����, 11��°���� ���
		String q = i.substring(5, 9); // 5��°���� 9��°���� ���� ���, 6~8��°���� ���
		
		// ���ڸ� �ϳ��� ������ �ű⼭ ���� ¥��
		
		System.out.println(c);
		System.out.println(q);
		
		//(8) trim ���� ����, �� ���� ������ ����
		
		String abc = "�ȳ��ϼ���: ";
		String abc1 = abc.trim();
		
		System.out.println(abc1);
		
		//(9) Value Of => �������� ���� ���������� ��ȯ���ش�.
		// �۾�ü�� ������ ����. ������ �ִ� ���� Static Method�̴�.
		// ����ϴ¹� : Ŭ������.Method�� �����
		
		String u = String.valueOf(1);
		
		System.out.println(u);
		
		//(10) replace �������ڿ��� �ٸ� ���ڿ��� ��ü
		
		String k1 ="����ȭ, ��õ��, ȭ������";
		
		k1 = k1.replace(",","/");
		System.out.println(k1);
		
		// �߿���� equlas, split, index of, lastindexof
		
	}

}
