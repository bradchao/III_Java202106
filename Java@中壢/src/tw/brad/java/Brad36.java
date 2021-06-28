package tw.brad.java;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad36 extends JFrame {
	private JButton b1, b2, b3;
	
	public Brad36() {
		super("我的視窗程式");
		
		setLayout(new FlowLayout());
		
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		b3 = new JButton("B3");
		
		add(b1); add(b2); add(b3);

//		b1.addActionListener(new MyListener());
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("OK2");
			}
			
		});
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad36();
	}

}

class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}





