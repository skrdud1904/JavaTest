package inheritance_ex1;

public class Interface_Test implements CatWorld {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("야옹야옹");
	}
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("테스트입니다.");
	}
	public void getout() {
		// TODO Auto-generated method stub
		System.out.println("나가 주세요.");
	}
	

	public static void main(String[] args) {
		
		Interface_Test hello = new Interface_Test();
		
		hello.call();
		hello.test();
		hello.getout();

	}

}
