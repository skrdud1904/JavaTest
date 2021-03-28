package inheritance_ex1;

public class Inheritance_ex1 {
		
		/*
		 * 상속 - 기존의 Class를 새로운 Class로 작성하는 것
		 * 이러한 것을 코드의 재사용이라고 한다.
		 * 두개의 Class를 서로 부모와 자식 관계를 맺어주는것
		 * 
		 * class 자식클래스 이름 extends 부모 클래스{
		 * 
		 * }
		 * 
		 * class Parent {}
		 * 
		 * class Child extends Parent{
		 * }
		 * 자손은 조상의 모든 Member를 상속받는다. (생성자, 초기화 블록 제외)
		 * 자손의 멤버 개수는 조상보다 작을 수가 없다. (같거나 많다)
		 * 
		 * Class Parent{
		 * 		int age;
		 * }
		 * 
		 * class Child extends Parent {
		 * }
		 * 
		 * 자바는 단일 상속만 허용된다 두개의 조상을 모실수가 없음 C++은 다중상속이 허용된다.
		 * 두개를 상속 받았을때는 같은 메서드 이름이 존재한다면 무엇을 상속받을 지 모르기
		 * 때문에 따라서 비중이 높은 클래스 하나는 상속 나머지 하나는 포함 관계로 둔다
		 * 
		 * new로 어떠한 인스턴스를 생성하는 것을 포함 관계라고 한다.
		 */


}
