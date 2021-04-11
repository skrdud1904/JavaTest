package access_Pkg1;

/*
 * Default 접근제어자에서는 같은 Class에서는 모두 접근이 가능하다.
 * class My_Parents {

	}
 */

// ★★★ 하나의 소스 파일에는 퍼블릭 클래스는 딱 하나만
// ★★★ 퍼블릭 클래스 이름과 소스파일의 이름은 일치해야 한다.
public class My_Parents {
	
	private int prv; // 같은 Class내에 접근 가능,
	// Method를 통해서 외부에서 접근하는 파라미터와 내부에서 접근하는 파라미터를 통해서 전달해야 한다. => 변수 명 변경
	
	int dft; // 같은 Package내에 접근 가능
	protected int prt; // 같은 패키지 + 자손 (다른 패키지)
	public int pub; // 접근 제한이 존재하지 않음
	
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
		// System.out.println(p.prv); 다른 Class에서 사용해서 오류가 발생했다.
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}
	
}
