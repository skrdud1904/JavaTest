package inheritance_ex2;

public class Son extends Family implements Job{
	
	public Son() {
		
	}
	
	public Son(String name) {
		super(name);
	}

	@Override
	public String work() {
		return "���θ� �Ѵ�.";
	}
	
	public String toString() {
		return super.toString()+work();
	}
	
	

}
