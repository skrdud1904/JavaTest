package access_Pkg1;

/*
 * Default ���������ڿ����� ���� Class������ ��� ������ �����ϴ�.
 * class My_Parents {

	}
 */

// �ڡڡ� �ϳ��� �ҽ� ���Ͽ��� �ۺ� Ŭ������ �� �ϳ���
// �ڡڡ� �ۺ� Ŭ���� �̸��� �ҽ������� �̸��� ��ġ�ؾ� �Ѵ�.
public class My_Parents {
	
	private int prv; // ���� Class���� ���� ����,
	// Method�� ���ؼ� �ܺο��� �����ϴ� �Ķ���Ϳ� ���ο��� �����ϴ� �Ķ���͸� ���ؼ� �����ؾ� �Ѵ�. => ���� �� ����
	
	int dft; // ���� Package���� ���� ����
	protected int prt; // ���� ��Ű�� + �ڼ� (�ٸ� ��Ű��)
	public int pub; // ���� ������ �������� ����
	
	public void printMember() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}

}

class MyparentTest {
	
	public static void main(String[] args) {
		
		My_Parents p = new My_Parents();
		// System.out.println(p.prv); �ٸ� Class���� ����ؼ� ������ �߻��ߴ�.
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}
	
}
