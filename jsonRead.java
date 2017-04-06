package BridgeLab;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.util.*;
import java.io.*;
public class jsonRead
{
	public static void main(String[] args) 
	{
	JSONParser jp=new JSONParser();
	try
	{
	Object ob=jp.parse(new FileReader("/home/bridgeit/workspace/BridgeLab/src/BridgeLab/j.json"));
	JSONObject  jo=(JSONObject)ob;
	System.out.println(jo);
    JSONArray ja=(JSONArray)jo.get("Rice");
    Iterator it=ja.iterator();
    while(it.hasNext())
    {
    Object o=it.next();
    System.out.println(o);
    }
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}

}
