package BridgeLab;
import java.util.regex.*;
import java.awt.image.ReplicateScaleFilter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
public class Regex {
	public static void main(String[] args) {
		String st="Hello <<name>> We have your full name as <<full name>> "
				+ "in our system. your contact number is 91-xxxxxxxxxx."
				+ "Please,let us know in case of any clarification Thank "
				+ "you BridgeLabz 01/01/2016.";
		
		Scanner sc=new Scanner(System.in);
		Scanner sd=new Scanner(System.in);
		String st1="<<name>>";
		String st2="<<full name>>";
		String st3="xxxxxxxxxx";
		String st4="01/01/2016.";
		
		
		Pattern p;
		Matcher m;
		DateFormat dateformat=new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
		Date da=new Date();
		System.out.println(dateformat.format(da));
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter full name");
		String fname=sd.nextLine();
		
		System.out.println("enter the mobile number");
		String mobno=sc.next();
		
//		System.out.println("enter the date");
//		String date=sc.next();
		
		p=Pattern.compile(st1);
	    m=p.matcher(st);
		st=m.replaceAll(name);
		
		p=Pattern.compile(st2);
		m=p.matcher(st);
		st=m.replaceAll(fname);
		
		p=Pattern.compile(st3);
		m=p.matcher(st);
	    st=m.replaceAll(mobno);
		
		p=Pattern.compile(st4);
		m=p.matcher(st);
		st=m.replaceAll(dateformat.format(da));
		
		System.out.println(st);
	}

}