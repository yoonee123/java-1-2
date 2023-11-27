package GUI;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() 
	{
		this.setTitle("300x300 스윙 프레임 만들기");
		this.setSize(300,300); // 프레임 크기 300x300
		this.setVisible(true); // 프레임 출력
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}
}
