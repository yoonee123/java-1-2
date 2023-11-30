import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintLine extends JFrame {
	MyPanel mp = new MyPanel();
	
	public PaintLine() 
	{
		this.setTitle("Graghics exam");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(mp);
		
		this.setSize(500, 500);
		this.setVisible(true);
	
		mp.setFocusable(true);
		mp.requestFocus();
	}
	
	class MyPanel extends JPanel {
		Point startP, endP;	
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() 
		{
			this.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
					
				}
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
				public void mouseEntered(MouseEvent e) {
			
				}
				public void mouseExited(MouseEvent e) {

				}				
			});
			this.addMouseMotionListener(new MouseMotionListener() {
				public void mouseDragged(MouseEvent e) {
					endP = e.getPoint();
					repaint();
				}
				public void mouseMoved(MouseEvent e) {
					
				}
			});
		}
		
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			for(int i = 0; i < vStart.size(); i++)
			{
			Point s = vStart.get(i);
			Point e = vEnd.get(i);
			
			g.drawLine(s.x, s.y, e.x, e.y);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PaintLine();
	}

}
