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
		System.out.println("파일에 저장할 수 없습니다. 확인해주십시오");
		e.getStackTrace();
	}
	}
}
		
	

