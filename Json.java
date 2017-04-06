package BridgeLab;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import java.io.FileWriter;
import java.io.IOException;
public class Json 
{
    public static void main(String[] args) {
		JSONObject ob=new JSONObject();
		ob.put("age",new Integer(25));
		ob.put("salary",new Double(25000));
		ob.put("name", "Chakravarti");
		JSONArray  ja=new JSONArray();
		ja.add("aaaa");
		ja.add("bbbb");
		ja.add("CCCC");
		ob.put("dsfgbb", ja);
		try
		{
			FileWriter f=new FileWriter("/home/bridgeit/workspace/BridgeLab/src/BridgeLab/don.json");
			f.write(ob.toJSONString());
			f.flush();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(ob);
	}	
 
    
}