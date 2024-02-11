package StackPrac;

import java.util.*;

class MyVector extends Vector {
	
	public MyVector() {
		super(1,1);
	}
	
	void addInt(int i) {
		addElement(new Integer(i));
	}
	
	void addFloat(float f) {
		addElement(new Float(f));
	}
	
	void addString(String s) {
		addElement(s);
	}
	
	void addCharArray(char a[]) {
		addElement(a);
	}
	
	void write() {
		Object o;
		int length = size();
		
		for(int i=0;i<length; i++) {
			o = elementAt(i);
			
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o));
			}else {
				System.out.println(o.toString());
			};
		};
	}
	
}

public class VectorEx02 {

	public static void main(String[] args) {
		
		MyVector v = new MyVector();
		
		int digit = 5;
		float real = 3.14f;
		char[] letters = {'J','A','V','A'};
		String s = new String("Love u");
		
		v.addInt(digit);
		v.addFloat(real);
		v.addString(s);
		v.addCharArray(letters);
		
		v.write();

	}

}
