package access_Pkg2;

import access_Pkg1.My_Parents;

class MyChild extends My_Parents {
		 public void printMembers() {
			 /* System.out.println(prv); ���� �߻�
			 * System.out.println(dft); �����߻�
			 */
			 System.out.println(prt); // �ٸ���Ű�� ���� �ڼ��̱� ������ ����
			 System.out.println(pub); // ���������� ����
		 }
	}


public class MyparentTest2 {

	public static void main(String[] args) {
		My_Parents p = new My_Parents();
		// System.out.println(p.prv);
		// System.out.println(p.dft);
		// System.out.println(p.prt);
		System.out.println(p.pub); // �ۺ��� ������ ����
}
}
