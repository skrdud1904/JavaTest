package inheritance_ex1;

public class Interface_Test implements CatWorld {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("�߿˾߿�");
	}
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("�׽�Ʈ�Դϴ�.");
	}
	public void getout() {
		// TODO Auto-generated method stub
		System.out.println("���� �ּ���.");
	}
	

	public static void main(String[] args) {
		
		Interface_Test hello = new Interface_Test();
		
		hello.call();
		hello.test();
		hello.getout();

	}

}
