package Exam;

public class PracticeEx03 {

	String title, artist, year, contry;
	String a, b, c, d;
	
	public PracticeEx03() {
		title = "";
		artist = "";
		year = "";
		contry = "";
	}
	
	public PracticeEx03(String a, String b, String c, String d) {
		this.title = a;
		this.artist = b;
		this.year = c;
		this.contry = d;
	}
	
	void show() {
		System.out.printf("%s국적의 %s가 %s년에 부른 %s", contry, artist, year, title);
	}
}
