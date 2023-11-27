package exer;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FilerReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "UTF-8");
			int c;
			
			System.out.print("인코딩 문자 집합은 " + in.getEncoding());			
			while ((c=in.read()) != -1) 
			{
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch(IOException e) 
		{
			System.out.println("입출력 오류");
		}
	}

}
