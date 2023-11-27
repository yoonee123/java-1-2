package exer;

import java.io.*;
import java.util.*;

public class BufferedIOEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		
		try 
		{
			fin = new FileReader("c:\\temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c=fin.read())!= -1) 
			{
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();
			
			out.close();
			fin.close();
			
		}	catch(IOException e)
		{
			System.out.println("¾îÂ¼±¸ ÀúÂ¼±¸");
		}
	}

}
