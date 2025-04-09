package net.twonibbles;

import java.util.LinkedHashMap;
import java.util.Map;

public class testbed {

	
	public static void main(String[] args) {
			
		// Group 11 occurs once in each set 
		int Group1 = lookupTbl("one","two","three","four","five","six","seven","eight","nine");
		// Group two occurs 1 times in each set
		int Group2 = lookupTbl("eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen");
		// Group two occurs 10 times in each set
		int Group3 = lookupTbl("twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety");
		// You can not forget the number 10
		int Group4 = lookupTbl("ten");
		//build the first 99 numbers
		int Grp1 = Group1 * 9;
		int Grp2 = Group2;
		int Grp3 = Group3 * 10;
		int Grp4 = Group4;
		int Grp_99_Total = Grp1 + Grp2 + Grp3 + Grp4;
		System.out.println("The first 99 total is: " + Grp_99_Total);
		// how many times does hundred occur in each set
		// it occurs 100 times in each set
		int Group_100 = lookupTbl("hundred");
		//number in set = Group_100 * 100
		int Grp_100_Total = Group_100 * 100;
		System.out.println("Number of occurences of 100 in a set: " + Grp_100_Total);
		// build out 100 set of numbers. 
		// first 100 numbers = Grp_99_Total
		// Number times 100 occurs in the set  Grp_100_Total
		//Number of times "and" occurs in the set = 99
		int Group_And = lookupTbl("and");
		int Grp_And_Total = Group_And * 99;
		System.out.println("Number of occurences of and in a set: " + Grp_And_Total);
		System.out.println("Set total is: " + (Grp_99_Total + Grp_100_Total + Grp_And_Total));
		//number of set in project = 9 
		int Set_Total = (Grp_99_Total+Grp_100_Total+Grp_And_Total) * 9;
		// You can not forget the thousand at the end.
		int Hundreds_Total = Group1 * 100;
		
		int Grp_1000_Total = lookupTbl("one","thousand");
		//Calculate grand total
		int Grand_Total = Hundreds_Total + Grp_99_Total + Set_Total + Grp_1000_Total;
		System.out.println("Grand total is: " + Grand_Total);
		
	}
	
	public static int lookupTbl(String... s) {
		
		LinkedHashMap<String, Integer> NumTable = new LinkedHashMap<String, Integer>();
		
		NumTable.put("and", 3);
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
		
		int x = s.length;
        int sum = 0;
        
        for(int i = 0; i < x; i++) {
        sum += NumTable.get(s[i]);
        }
        
        return sum;	
		
	}
		
}


