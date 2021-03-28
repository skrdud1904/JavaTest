package inheritance_ex1;

// ����� TV �����ܿ� ������ ���� �Ѵ�.
// LG ������ -> �Ｚ �������� ��� �޴´�.

	class Tv {
		//�θ��� ����� 5��
		boolean power; // ��������(on/off)
		int channel; // ä��
		
		void power(){power = !power;}
		void channelup() {++channel;}
		void channelDown() {--channel;}
	}
	
	class SmartTv extends Tv{ // SmartTv Tv�� �ڸ��� �����ִ� ��� 
		
		// �ڽ� ��� 2�� �θ� ��� 5��
		// SmarTv�� ����� 7��
		
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
			
			testTv.displayCaption("�ȳ��ϼ���");
			testTv.caption = true;
			testTv.displayCaption("�ݰ�����");
		}


	}




