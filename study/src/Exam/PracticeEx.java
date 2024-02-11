package Exam;

public class PracticeEx {

	String brand, year, inch;
	
	public PracticeEx() {
		this.brand = "";
		this.year = "";
		this.inch = "";
	}
	
	public PracticeEx(String brand) {
		this();
		this.brand = brand;
	}
	
	public PracticeEx(String brand, String year) {
		this(brand);
		this.year = year;
	}
	
	public PracticeEx(String brand, String year, String inch) {
		this(brand, year);
		this.inch = inch;
	}

	public String getBrand() {
		return brand;
	}

	public String getYear() {
		return year;
	}

	public String getInch() {
		return inch;
	}
	
	void show() {
		System.out.printf("%s에서 만든 %s년 %s인치", brand, year, inch);
	}
	
}
