import java.io.*;
import java.util.*;
//import java.util.Arrays;
class Binary
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
			String ss[]=ms.split(" ");
			Arrays.sort(ss);
			/*for(int i=0;i<ss.length;i++)
			{
			System.out.println(ss[i]);	
			}
			Set s1=new TreeSet();
			for(int i=0;i<ss.length;i++)
			{
			s1.add(ss[i]);
			}
			System.out.println(s1);*/
			System.out.println("enter the word to search");
			String sd=sc.nextLine();
			int low=0;
			int high=ss.length-1;
			while(low<=high)
			{
			int mid=low+high;
			if(ss[mid].equalsIgnoreCase(sd)==true)
			{
			System.out.println("The given word is found");
			return;
			}
			else if(ss[mid].hashCode()>sd.hashCode())
			{
			low=mid+1;
			}
			else
			{
			high=mid-1;
			}
			
			}
			System.out.println("the given word is not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
