package inheritance_ex2;

public class Father extends Family implements Job{
	
	public Father() {
		
	}
	public Father(String name) {
		super(name); // ��ӹ��� �θ��� Class�� ����� �� super�� ����Ѵ�.
		// Family �������� name�� �ְ� 
	}
	
	@Override
	public String work() {
		return "������ ���� �Ѵ�";
	}
	
	@Override
	public String toString() {
		return super.toString()+work();
	}

}
