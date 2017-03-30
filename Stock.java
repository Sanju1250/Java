import java.util.*;
class Stock
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	Scanner ic=new Scanner(System.in);
	Scanner dc=new Scanner(System.in);
	List ls=new LinkedList();
	System.out.println("enter the number of Stocks");
	int Nstock=ic.nextInt();
	int i=0;
	double stockValue=0.0;
	while(i<Nstock)
	{
	System.out.println("enter the Share Name");
	String StockName=sc.nextLine();
	
	System.out.println("enter the Share Number");
	int ShareNumber=ic.nextInt();
	
	
	System.out.println("enter the Share price");
	double SharePrice=dc.nextDouble();
	stockValue=ShareNumber*SharePrice;
	System.out.println("stock Value of "+StockName+" is  "+stockValue);
	ls.add(stockValue);
	i++;
	
	}
	double TotalValue=0.0;
	for(int j=0;j<ls.size();j++)
	{
	Double l=(Double)ls.get(j);
	TotalValue=TotalValue+l;
	
	}
	System.out.println("the total Value "+TotalValue);
	}
}
