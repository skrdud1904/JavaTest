package inheritance_ex2;

public class Family {
	private String name="홍길동";
	
	
	public Family() {
		
	}
	
	public Family(String name) {
		this.name=name; // this 해당 Class안에있는 변수명을 의미 즉 Class안에 있는 값
	}
	public String toString() {
		return "이름 : " +name+"\n";
	}

}
