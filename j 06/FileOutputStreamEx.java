package exer;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = {7 , 51, 3, 4};
		FileOutputStream fout = null;
	
	try 
	{
		fout = new FileOutputStream("c:\\temp\\test.out");
		for(int i = 0; i<b.length; i++)
		{
			fout.write(b[i]);
		}
		fout.close();
	} catch(IOException e) 
	{
		System.out.println("���Ͽ� ������ �� �����ϴ�. Ȯ�����ֽʽÿ�");
		e.getStackTrace();
	}
	}
}
		
	

