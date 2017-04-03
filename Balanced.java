import java.util.*;
class Balanced
{ 
 static boolean balanced(String st)
 {
 Stack s=new Stack();
  char ch[]=st.toCharArray();
  for(int i=0;i<ch.length;i++)
  {
      if(ch[i]=='{'||ch[i]=='('||ch[i]=='[')
      {
      s.push(ch[i]);
      }
      else
      {
         switch(ch[i])
         {
          case '}':if((char)s.pop()!='{')
                   return false;
                   break;
          case  ']':if((char)s.pop()!='[')
                   return false;
                   break;
          case  ')':if((char)s.pop()!='(')
                   return false;
                  break;
         }
      } 

   }
 return true;
 }
	public static void main(String args[])
	{
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String");
	String st="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";
        boolean res=balanced(st);
        if(res)
        System.out.println("Arithametic expression is Balanced");
	else
	System.out.println("Arithematic expression is not Balanced");
	}
}
