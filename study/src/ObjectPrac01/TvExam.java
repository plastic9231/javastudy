package ObjectPrac01;

public class TvExam {

	public static void main(String[] args) {
		
		Tv tv;	//클래스변수, 객체, 인스턴스 선언
		tv = new Tv();
		
		tv.channel = 13;
		System.out.printf("현재 시청중인 채널은 %d번 채널입니다.%n", tv.channel);
		tv.channelUp();
		System.out.printf("현재 시청중인 채널은 %d번 채널입니다.%n", tv.channel);

	}

}
