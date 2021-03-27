package vo_test;

// vo를 생성하고 syso로 접근해서 그 어떤 값을 출력하는 프로그램 만들기

// main Class 파일에서 값만 담을 수 있는 vo Class를 만들고 main에서는 scanner로 값을 바꿀 수 있는 프로그램 만들기

public class Practice_vo {
	String Test;

	public Practice_vo() {
		super();
		
	}

	
	@Override
	public String toString() {
		return "Practice_vo [Test=" + Test + "]";
	}


	public String getTest() {
		return Test;
	}

	public void setTest(String test) {
		Test = test;
	}

}
