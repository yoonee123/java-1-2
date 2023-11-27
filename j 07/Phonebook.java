package phonebook;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Phonebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> book = new Vector<Person>();
		Scanner s = new Scanner(System.in);
		File f = new File("c:\\temp\\Phonebook.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		// ������ ������ ������ �о ����Ŭ������ ����
		
		try
		{
			if(f.exists())
			{
				br = new BufferedReader(new FileReader(f));
				while(true)
				{
					String line = br.readLine();
					if(line != null)
					{
						String t[] = line.split(" ");
						Person p = new Person(t[0], t[1], t[2]);
						book.add(p);
					}
					else
					{
						break;
					}
				}
				br.close();
			}
		} catch (IOException e)
		{
			System.out.println("���� �߻�");
		}		
		while(true) 
		{
			System.out.println("�Է�(1), �˻�(2), ����(3), "
					+ "����Ʈ(4), ����(5), ����(6)");
			int input = s.nextInt();
			if (input == 1)
			{
				System.out.println("�̸� ��ȭ��ȣ �̸����� �Է��ϼ���");
				String n = s.next();
				String p = s.next();
				String e = s.next();
				book.add(new Person(n, p, e));
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
			}
			else if (input == 2)
			{
				System.out.println("�˻��� ����� �̸��� �Է��Ͻÿ�.");
				String name = s.next();
				
				for(int i = 0; i < book.size(); i++)
				{
					Person p = book.get(i);
					if(name.equals(p.name))
					System.out.println(p.name + " " + p.phone + " " + p.email);
						break;
				}
				
			}
			else if (input == 3)
			{
				System.out.println("������ ����� �̸��� �Է��Ͻÿ�.");
				String name = s.next();
				
				for(int i = 0; i < book.size(); i++)
				{
					Person p = book.get(i);
					if(name.equals(p.name))
						book.remove(i);
						System.out.println("��û�� ����� �����߽��ϴ�.");
						break;
				}
			}
			else if (input == 4)
			{
				for(int i = 0; i < book.size(); i++)
				{
					Person p = book.get(i);
					System.out.println(p.name + " " + p.phone + " " + p.email);
				}
			}
			else if (input == 5)
			{
				// ���Ͽ� �������ִ� ���
				try
				{
					bw = new BufferedWriter(new FileWriter(f));
					for(int i = 0; i < book.size(); i++)
					{
						Person p = book.get(i);
						bw.write(p.name + " " + p.phone + " " + p.email + "\r\n");
					}	
					System.out.println("���Ͽ� ������ �Ǿ����ϴ�.");
					bw.close();
				} catch(IOException e)
				{
					System.out.println("���� �߻�");
				}
			}
			else if (input == 6)
			{
				System.out.println("��ȭ��ȣ�θ� �����մϴ�.");
				break;
			}
		}
	}

}
