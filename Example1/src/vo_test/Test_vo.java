package vo_test;

public class Test_vo {

	public static void main(String[] args) {
		
		// get, set���� vo���� �����´�.
		// ������ set���� �ϰ� ������ ���� get���� �����´�.

		Member_vo ex = new Member_vo();
		Member_vo ex2 = new Member_vo("blackarcon", "choi", "1111", "skrdud1904@naver.com", "010-7593-0969", 3);
	
	System.out.println(ex2.toString());
	ex.setMember_id("skrdud");
	System.out.println(ex.getMember_id());
	}

}
