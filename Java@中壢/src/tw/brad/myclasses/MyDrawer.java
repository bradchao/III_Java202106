package tw.brad.myclasses;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyDrawer extends JPanel {
	private LinkedList<HashMap<String,Integer>> line;
	
	public MyDrawer() {
		setBackground(Color.GREEN);
		
		line = new LinkedList<>();
		
		MyMouseAdapter adapter = new MyMouseAdapter();
		addMouseMotionListener(adapter);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.BLUE);
		
		for(int i=1; i<line.size(); i++) {
			HashMap<String, Integer> p0 = line.get(i-1);
			HashMap<String, Integer> p1 = line.get(i);
			g.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
		}
		
	}
	
	private class MyMouseAdapter extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String,Integer> point = new HashMap<>();
			// x -> 12; y -> 34
			point.put("x", e.getX()); point.put("y", e.getY());
			line.add(point);
			repaint();
		}
	}
	
}



