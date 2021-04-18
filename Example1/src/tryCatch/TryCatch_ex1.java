package tryCatch;

public class TryCatch_ex1 {
	/*
	 * try~catch문은 개발자가 정말 습관처럼 쓰는 코드중 하나임.
	 * 웹 개발의 경우 어느 경우이든간에 에러를 봐야 한다.
	 * 개발하면서 가장 중요한 법 -> 오류가 났을때 그 오류를 해결해야 한다. (Perfomance가 안나오고 느리게 된다.)
	 * 어디에서 에러가 났는지 위치정도는 알아야 한다.
	 * Array 범위 넘김, Null값 Check
	 * 예외처리의 정의?
	 * - 프로그램 실행시 발생할 수 있는 예외의 발생을 대비하여 Code를 작성한다.
	 * 프로그램 개발시 에러나 오류가 발생했을 경우? Try~Catch문을 사용 -> Program 실행시 발생할 수 있는 예외를 대비하여 Code를 작성한다.
	 * 프로그램의 비정상적인 종료를 막는 것을 방지한다.
	 * 1. Complie 에러
	 * 2. Runtime 에러
	 * 3. 논리적 에러
	 * 
	 * 대부분 맞는 에러는 Runtime Error이다. 에러, Exception Error
	 * Exception Error - 크게 치명적이지 않은 에러를 Exception Error라고 한다.
	 * ★Null Point Error - Parameter값에 Null값이 들어오는 에러
	 * 	1. SQL구문부터 본다.(제일 많이 걸림)
	 *  2. 변수명을 확인한다.
	 *  3. 들어오는 Parameter의 Type을 확인한다. VarChar
	 *     참조변수의 Type을 확인을 해야 한다.
	 */
	
	public static void main(String[] args) {
		
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			} 
			// Exception은 제일 최상위 클래스이다. 다른이름을 적어도 되지만 대부분 Exception(e)를 사용한다.
			// Exception(e)를 사용하는 이유? 여러 Exception을 하나의 Exception에 걸리게 하기 위해서
			// 정석적으로는 걸어줘야 한다.
			// e.printtrace로 볼 수 있지만 e말고 다른것은 사용하지 않는다.
			// try에서 에러가 발생하면 이를 처리한 e를 처리할 catch문으로 java가 내려간다.
			// catch에는 2가지가 있다.
			// printstacktrace : 에러발생당시 호출 Stack에 있었던 메서드와 정보를 출력(콘솔창)
			// GetMessage : 발생한 예외 클래스의 인스턴스에 저장된 Message를 볼 수 있다. 얻을 수 있다. JSON함수 호출할 때 사용한다.
			// IF문과 별개로 try ~ catch는 무조건 블록처리해야한다. 스코프처리해야함.
		}
		
	}


