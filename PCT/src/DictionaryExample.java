import java.util.HashMap;
import java.util.Map.Entry;

public class DictionaryExample {
	public static void main(String[] args){
		HashMap<Integer, String> hasMapValues = new HashMap<>();
		addValue(1, "One",hasMapValues);
		addValue(1, "One",hasMapValues);
		addValue(2, "Two",hasMapValues);
		addValue(3, "Three",hasMapValues);
		
		
		PrintAll(hasMapValues);
		
		System.out.println("Request value in HashMap: "+getValue(1, hasMapValues) );
		
	}
	
	public static void addValue(int key,String value,HashMap<Integer, String> hasMapValues){
		if(!hasMapValues.containsKey(key)){
			hasMapValues.put(key, value);
		}
	}
	
	public static String getValue(int key,HashMap<Integer, String> hasMapValues){
		return hasMapValues.get(key);
	}
	
	public static void PrintAll(HashMap<Integer, String> hasMapValues){
		
		for (Entry<Integer, String> hasMapValue : hasMapValues.entrySet()) {
			System.out.println("Key: "+hasMapValue.getValue() + " ,Value: "+hasMapValue.getValue());
		}
	}

}
