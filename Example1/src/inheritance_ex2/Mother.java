package inheritance_ex2;

public class Mother extends Family implements Job {
	
	public Mother() {
		
	}
	
	public Mother(String name) {
		super(name);
	}

	@Override
	public String work() {
		return "�������� �Ѵ�.";
	}
	public String toString() {
		return super.toString()+work();
	}

	

}
