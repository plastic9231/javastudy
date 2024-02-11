package ExceptionPrac;

import java.awt.*;
import java.awt.event.*;

public class WinEventEx extends Frame {
	
	public WinEventEx() {
		super("이벤트");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new WinEventEx();
	}

}
