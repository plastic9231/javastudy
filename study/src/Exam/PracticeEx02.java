package Exam;

public class PracticeEx02 {

	String name;
	int math, science, english;
	int sum;
	double avg;
	
	public PracticeEx02(int math, int science, int english) {
		sum = math+science+english;
	}
	
	public double average() {
		avg = sum/3.0;
		return avg;
	}
	
	
}
