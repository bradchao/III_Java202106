package tw.brad.myclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<LinkedList<Point>> lines;
	
	public MyDrawer() {
		setBackground(Color.GREEN);
		
		lines = new LinkedList<>();
		
		MyMouseAdapter adapter = new MyMouseAdapter();
		addMouseMotionListener(adapter);
	}

	// 想請問paintComponent什麼時候會被呼叫

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		
		for (LinkedList<Point> line : lines) {
			for(int i=1; i<line.size(); i++) {
				Point p0 = line.get(i-1);
				Point p1 = line.get(i);
				g.drawLine(p0.x, p0.y, p1.x, p1.y);
			}
		}
		
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			LinkedList<Point> line = new LinkedList<>();
			Point point = new Point(e.getX(), e.getY()); 
			line.add(point);
			lines.add(line);
			repaint();
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			
//			HashMap<String,Integer> point = new HashMap<>();
//			// x -> 12; y -> 34
//			point.put("x", e.getX()); point.put("y", e.getY());
			
			Point point = new Point(e.getX(), e.getY()); 
			lines.getLast().add(point);
			repaint();
		}
	}
}

class Point {
	int x, y;
	Point(int x, int y){this.x = x ; this.y = y;}
}



