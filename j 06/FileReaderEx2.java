package exer;

import java.io.*;


public class FileReaderEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = null;
		FileReader fin = null;
		char buf[] = new char[1024];
		
		try {
			//fin = new FileInputStream("c:\\Temp\\hangul.txt");
			fin = new FileReader("c:\\Temp\\hangul.txt");
//			in = new InputStreamReader(fin, "UTF-8");
			int n=0, c;
			
//			System.out.println("인코딩 문자 집합은 " + in.getEncoding());			
			while ((c=fin.read()) != -1) 
			{
//				System.out.print((char)c);
				buf[n] = (char)c;
				n++;
			}
			String line = String.valueOf(buf);
			String a[] = line.split(" ");
			int pos = Integer.parseInt(a[0]);
			int life = Integer.parseInt(a[1]);
			int zom1 = Integer.parseInt(a[2]);
			int zom2 = Integer.parseInt(a[3]);
			
			System.out.println(line);
			fin.close();
		} catch(IOException e) 
		{
			System.out.println("입출력 오류");
		}
	}

}
