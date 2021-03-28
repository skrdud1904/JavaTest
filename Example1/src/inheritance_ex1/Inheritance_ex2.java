package inheritance_ex1;

// 상속을 TV 리모콘에 비유를 많이 한다.
// LG 리모콘 -> 삼성 리모콘을 상속 받는다.

	class Tv {
		//부모의 멤버는 5개
		boolean power; // 전원상태(on/off)
		int channel; // 채널
		
		void power(){power = !power;}
		void channelup() {++channel;}
		void channelDown() {--channel;}
	}
	
	class SmartTv extends Tv{ // SmartTv Tv에 자막을 보여주는 기능 
		
		// 자식 멤버 2개 부모 멤버 5개
		// SmarTv에 멤버는 7개
		
		boolean caption;
		
		void displayCaption(String text) {
			if (caption) {
				System.out.println(text);
			}
		}
	}
	
	public class Inheritance_ex2 {
		public static void main(String[] args) {
			
			SmartTv testTv = new SmartTv();
			
			testTv.channel = 10;
			testTv.channelup();
			System.out.println(testTv.channel);
			
			testTv.displayCaption("안녕하세요");
			testTv.caption = true;
			testTv.displayCaption("반가워요");
		}


	}




