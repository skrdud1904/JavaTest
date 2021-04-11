package access_Pkg2;

import access_Pkg1.My_Parents;

class MyChild extends My_Parents {
		 public void printMembers() {
			 /* System.out.println(prv); 에러 발생
			 * System.out.println(dft); 에러발생
			 */
			 System.out.println(prt); // 다른패키지 더라도 자손이기 때문에 가능
			 System.out.println(pub); // 접근제한이 없음
		 }
	}


public class MyparentTest2 {

	public static void main(String[] args) {
		My_Parents p = new My_Parents();
		// System.out.println(p.prv);
		// System.out.println(p.dft);
		// System.out.println(p.prt);
		System.out.println(p.pub); // 퍼블릭만 접근이 가능
}
}
