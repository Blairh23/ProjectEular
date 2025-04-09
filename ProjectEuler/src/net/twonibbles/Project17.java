package net.twonibbles;

import java.util.LinkedHashMap;
import java.util.Map;

public class Project17 {

	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> NumTable = new LinkedHashMap<String, Integer>();
		
		NumTable.put("one", 3);
		NumTable.put("two", 3);
		NumTable.put("three", 5);
		NumTable.put("four", 4);
		NumTable.put("five", 4);
		NumTable.put("six", 3);
		NumTable.put("seven", 5);
		NumTable.put("eight", 5);
		NumTable.put("nine", 4);
		NumTable.put("ten", 3);
		NumTable.put("eleven", 6);
		NumTable.put("twelve", 6);
		NumTable.put("thirteen", 8);
		NumTable.put("fourteen", 8);
		NumTable.put("fifteen", 7);
		NumTable.put("sixteen", 7);
		NumTable.put("seventeen", 9);
		NumTable.put("eighteen", 8);
		NumTable.put("nineteen", 8);
		NumTable.put("twenty", 6);
		NumTable.put("thirty", 6);
		NumTable.put("forty", 5);
		NumTable.put("fifty", 5);
		NumTable.put("sixty", 5);
		NumTable.put("seventy", 7);
		NumTable.put("eighty", 6);
		NumTable.put("ninety", 6);
		NumTable.put("hundred", 7);
		NumTable.put("thousand", 8);
		
		System.out.println("" + NumTable);
		System.out.println();
		
		for (Map.Entry<String, Integer> mapElement :
			NumTable.entrySet()) {
			
			Integer k = mapElement.getValue();
			
			String v = mapElement.getKey();
			
			System.out.println(v + " : " + k);
		}
			
			
		
		System.out.println();
		
	
		int result = add(5,7);
		int sum2 = sumNumber(2,4,6);
		
		System.out.println();
		System.out.println("The result is: " + result);
		System.out.println("The value of fifteen is: " + NumTable.get("fifteen"));
		System.out.println("The value of hundred is: " + NumTable.get("hundred"));
		System.out.println("The value of one is: " + NumTable.get("one"));
		System.out.println();
		System.out.println("Sum2 = " + sum2);
		
		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
		
	public static int sumNumber(int ... args){
        System.out.println("argument length: " + args.length);
        int sum = 0;
        for(int x: args){
            sum += x;
        }
        return sum;
    }
}

