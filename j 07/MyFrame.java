package GUI;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() 
	{
		this.setTitle("300x300 ���� ������ �����");
		this.setSize(300,300); // ������ ũ�� 300x300
		this.setVisible(true); // ������ ���
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}
}
