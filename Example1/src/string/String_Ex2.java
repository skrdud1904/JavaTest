package string;

public class String_Ex2 {
	
	/* 
	 * String은 하나의 Class이고 문자열이란 문자의 나열이다.
	 * 자바에서 String Class는 Char의 배열이고 Method들의 집합이다.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "안녕 ";
		String b = "나는 최낙영이야";
		
		a = a + b;
		
		System.out.println(a);
		
		String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1 에저장됨
		String str2 = "abc"; // 문자열 리터럴 "abc"의 주소가 str2 에저장됨
		
		String str3 = new String("abc"); // 새로운 String 인스턴스를 생성
		String str4 = new String("abc"); // 새로운 String 인스턴스를 생성
		
		if(str1 == str2) {
			System.out.println("str1과 str2는 같다");
		}
		else {
			System.out.println("str1과 str2는 다르다");
		}
		
		if(str3 == str4) {
			System.out.println("str1과 str2는 같다");
		}
		else {
			System.out.println("str1과 str2는 다르다");
		}
		
		// (3) 문자열 초기화
		String str = "";
		
		// (4) String의 메서드, equals 굉장히 중요
		
		String s ="hello";
		String k = "Hello";
		boolean d = s.equals("hello");
		boolean f = s.equals("Hello");
	
		if(s.equals(k)) {
			System.out.println("두개는 같다");
		}else {
			System.out.println("두개는 다르다");
		}
		
		// (5) index of 반환하는 Method => int형을 반환
		
		String t = "hello";
		int idx1 = t.indexOf('o');
		int idx2 = t.indexOf('k');
		
		System.out.println(idx1);
		System.out.println(idx2);
		// index of idx1<0 => 글자가 존재하지 않는다.
		
		if(idx2 < 0) {
			System.out.println("일치하는 글자는 존재하지 않습니다.");
		} else {
			System.out.println("일치하는 글자는 존재합니다.");
		}
		
		String g = "ABCDEFG";
		
		int idx = g.indexOf("CD");
		
		System.out.println(idx);
		
		// last Index of 뒤에서부터 탐색
		// 오른쪽에서 왼쪽으로 값을 탐색
		// 반환하는 Type은 int type
		
		String p ="java.lang.Object";
		int index1 = p.lastIndexOf('.');
		int index2 = p.indexOf('.');
		
		System.out.println(index1); // 9가 출력되는 이유? 15부터 뒤로 카운팅
		System.out.println(index2);
		
		// length 길이 String의 길이를 출력
		
		String o = "abcdefg";
		int length = o.length();
		
		System.out.println(length);
		
		//(6) Split 짜를때 사용
		
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		// 배열을 출력할 때는 for문을 사용하면 된다.
		// 향상된 for문? for each문
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (String brr : arr) { // arr의 배열의 값을 brr로 넣은다음에 출력하면된다. for-each문 굉장히 많이 사용한다.
			System.out.println(brr); // 중요 : 향상된 for문
		}
		
		//(7) SubString 몇 번째부터 몇 번째까지 짜를 것인지 정의
		
		String i = "java.lang.object";
		String c = i.substring(10); // 잘린 문자형을 반환 10번째부터, 11번째부터 출력
		String q = i.substring(5, 9); // 5번째에서 9번째까지 실제 출력, 6~8번째까지 출력
		
		// 숫자를 하나만 적으면 거기서 부터 짜름
		
		System.out.println(c);
		System.out.println(q);
		
		//(8) trim 공백 제거, 맨 뒤의 여백을 제거
		
		String abc = "안녕하세요: ";
		String abc1 = abc.trim();
		
		System.out.println(abc1);
		
		//(9) Value Of => 숫자형의 값을 문자형으로 변환해준다.
		// 글씨체가 기울어져 있음. 기울어져 있는 것은 Static Method이다.
		// 사용하는법 : 클래스명.Method로 사용함
		
		String u = String.valueOf(1);
		
		System.out.println(u);
		
		//(10) replace 기존문자열을 다른 문자열로 대체
		
		String k1 ="무궁화, 삼천리, 화려강산";
		
		k1 = k1.replace(",","/");
		System.out.println(k1);
		
		// 중요순위 equlas, split, index of, lastindexof
		
	}

}
