import java.util.*;

public class Login_Data 
{
	Map<String, Integer> theMap = new HashMap<String, Integer>();
	{
	theMap.put("one", 111);
	theMap.put("two", 222);
	theMap.put("three", 333);
	theMap.put("four", 444);
	theMap.put("five", 555);
	}
	
	public boolean match(String login, String password)
	{
		
		if ((Integer.parseInt(password))==(theMap.get(login)))
			return true;
		
		return false;
	}
	
	

}
