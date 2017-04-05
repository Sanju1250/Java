import java.io.*;
import java.util.*;
class Linear
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	try {
			File f = new File("IPL");
			FileReader fr = new FileReader(f);
			StringBuffer sr = new StringBuffer();
			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) 
			{
			sr.append(line);
				
			}
			fr.close();
			System.out.println("Contents of file:");
			String ms=sr.toString();
			System.out.println(ms);
			System.out.println("enter the word to search");
			String sd=sc.nextLine();
			String ss[]=ms.split(" ");
			for(int i=0;i<ss.length;i++)
			{
			if(ss[i].equalsIgnoreCase(sd)==true)
			{
			
			System.out.println("the given word is found");
				return;
			}
			}
			System.out.println("The given word is not found");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
