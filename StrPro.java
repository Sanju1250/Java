import java.util.Scanner;
class StrPro
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the String");
  String st=sc.nextLine();
  String gs="Hello UserName, How are you?" ;
  String ss="UserName";
  char ch1[]=gs.toCharArray();
  char ch2[]=ss.toCharArray();
  gs="";
 	for(int i=0;i<ch1.length;i++)
	{
	int k=i;	
	int j=0;
	while(k<ch1.length&&j<ch2.length&&ch1[k]==ch2[j])
	{
	k++;
	j++;
	}
	if(j==ch2.length)
	{
	gs=gs+st;
	i=k-1;
	}
	else
	gs=gs+ch1[i];
	}
	System.out.println(gs);
  }
}

