package inheritance_ex2;

public class Father extends Family implements Job{
	
	public Father() {
		
	}
	public Father(String name) {
		super(name); // 상속받은 부모의 Class를 사용할 때 super를 사용한다.
		// Family 생성자의 name을 넣고 
	}
	
	@Override
	public String work() {
		return "나가서 일을 한다";
	}
	
	@Override
	public String toString() {
		return super.toString()+work();
	}

}
