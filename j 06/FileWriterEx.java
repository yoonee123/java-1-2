package exer;

import java.io.*;
import java.util.*;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try 
		{
			fout = new FileWriter("c:\\temp\\test.txt");
			System.out.println("파일에 저장할 문장을 입력");
			while (true) 
			{
				String line = s.nextLine();
				if(line.length()==0) 
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n" ,0 , 2);
			}
			fout.close();
		} catch(IOException e)
		{
			System.out.println("입출력 오류");
		}
	}

}
