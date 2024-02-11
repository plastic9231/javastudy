package ThreadPrac;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ClockEx extends Frame implements Runnable, ActionListener {
	
	private Button bt = new Button("시작");
	
	public ClockEx() {
		super("디지털 시계");
		setLayout(new BorderLayout());
		add("South", bt);
		
		WinEvent we = new WinEvent();
		
		bt.addActionListener(this);
		
		addWindowListener(we);
		
		setSize(600, 200);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bt) {
			bt.setEnabled(false);
			Thread tt = new Thread(this);
			tt.start();
		}
	}

	@Override
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		Calendar ca = Calendar.getInstance();
		Date d = ca.getTime();
		g.setFont(new Font("궁서체", Font.BOLD, 40));
		g.drawString(d.toString(), 50, 100);
	}

	public static void main(String[] args) {
		
		new ClockEx();

	}

}
