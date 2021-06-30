package tw.brad.java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.myclasses.MyDrawer;

public class MySign extends JFrame {
	private JButton clear, undo, redo, save;
	private MyDrawer myDrawer;
	
	public MySign() {
		super("簽名app");
		
		setLayout(new BorderLayout());
		
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		save = new JButton("Save");
		
		JPanel top = new JPanel(new FlowLayout());
		top.setBackground(Color.YELLOW);
		top.add(clear);top.add(undo);top.add(redo);top.add(save);
		add(top, BorderLayout.NORTH);
		
		myDrawer = new MyDrawer();
		add(myDrawer, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MySign();
	}

}
