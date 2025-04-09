package net.twonibbles;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Project18 {
	
	static int rows = 15;
	static int T[][] = new int[rows][];

	public static void main(String[] args) throws FileNotFoundException {
		
		int Position = 0;
		int Total = 0;
				
		int[] NumArry0 = {75};
		int[] NumArry1 = {95,64};
		int[] NumArry2 = {17,47,82};
		int[] NumArry3 = {18,35,87,10};
		int[] NumArry4 = {20,4,82,47,65};
		int[] NumArry5 = {19,1,23,75,3,34};
		int[] NumArry6 = {88,2,77,73,7,63,67};
		int[] NumArry7 = {95,65,4,28,6,16,70,92};
		int[] NumArry8 = {41,41,26,56,83,40,80,70,33};
		int[] NumArry9 = {41,48,72,33,47,32,37,16,94,29};
		int[] NumArry10 = {53,71,44,65,25,43,58,50,27,29,48};
		int[] NumArry11 = {70,11,33,28,77,73,17,78,39,68,17,57};
		int[] NumArry12 = {91,71,52,38,17,14,91,43,58,50,27,29,48};
		int[] NumArry13 = {63,66,4,68,89,53,67,30,73,16,69,87,40,31};
		int[] NumArry14 = {4,62,98,27,23,9,70,98,73,93,38,53,60,4,23};
		
		int[][] NumArry = {NumArry0,NumArry1,NumArry2,NumArry3,NumArry4,NumArry5,NumArry6,NumArry7,NumArry8,NumArry9,NumArry10,NumArry11,NumArry12,NumArry13,NumArry14};
		
		//-----------------------------------------------------------------------
		int R[] = new int[2];
		for(int i = 0; i < NumArry.length; ++i) {
			if(Position == 0) {
				R = test.Path_Route(Position, NumArry[i]);	
				Position = R[1];
				Total += R[0];
				//System.out.println("Position: " + Position);
			} else
			{
				R = test.Path_Route_2(Position, NumArry[i]);
				Position = R[1];
				Total += R[0];
				//System.out.println("P: " + Position);
			}
			System.out.println("Route " + ": " + i + " has a position of "+R[1] + " and a value of " + R[0]);
		}
		System.out.println();
		System.out.println("The path total is: " + Total);
		System.out.println();
		//-------------------------------------------------------------------------
		Scanner s = new Scanner(new File("triangle.txt")); 
		for(int i=0;i<rows;++i) {
            T[i]=new int[i+1];
            for(int j=0;j<=i;++j)
                T[i][j]=s.nextInt();
            	}
        System.out.println(mrs1(0,0));
        s.close();
        
        try {
            Scanner file = new Scanner(new File("triangle.txt"));
            while(file.hasNextLine()) {
            	String line = file.nextLine();
            	System.out.println(line);
            }
            file.close();
          	}
        catch(Exception ex) {
        	ex.printStackTrace();
        }
	}
		//-------------------------------------------------------------------------	
      	
	
		
			
		
		
		
	
	
	static int mrs(int y,int x) {
        return rows-1==y?T[y][x]:T[y][x]+Math.max(mrs(y+1,x),mrs(y+1,x+1));}
        
    static int mrs1(int y,int x) {
        if(rows-1==y) {
        	return T[y][x];}
        	else {
        	return T[y][x]+Math.max(mrs1(y+1,x),mrs1(y+1,x+1));}
    }
		
	
class test {
		
		
		static int[] getSumAndAdd(int a, int b) {
			
			int[] ans = new int[2];
			ans[0] = a + b;
			ans[1] = a - b;
			
			return ans;
			
		}
		
		
		static int[] Path_Route(int startNum, int[] array) {
			
			int[] ans = new int[2];
			
			if ( array == null || array.length == 0 ) { ans[0] = -1; }
			
			//---------------------------------------------------------------------
			else if (array.length == 1) {ans[0] = array[0]; ans[1] = 0;}
			
			else {
			//---------------------------------------------------------------------
			
			  
			  if(array[startNum] > array[startNum + 1]) { ans[0] = array[startNum]; } else
			  if (array[startNum] < array[startNum + 1]){ ans[0] = array[startNum + 1]; }
			  
			  if(array[startNum] > array[startNum + 1]) { ans[1] = startNum; } else if
			  (array[startNum] < array[startNum + 1]) { ans[1] = startNum + 1;}
			  //--------------------------------------------------------------------
			  startNum = ans[1];
			  //--------------------------------------------------------------------
			}
			
			return ans;
		}
		
		
		
			static int[] Path_Route_2(int startNum, int[] array) {
			
			int[] ans = new int[2];
			
			if ( array == null || array.length == 0 ) { ans[0] = -1; }
			
			//---------------------------------------------------------------------
			else if (array.length == 1) {ans[0] = array[0]; ans[1] = 0;}
			
			else {
			//---------------------------------------------------------------------
			
			  
			  if(array[startNum-1] > array[startNum]) { ans[0] = array[startNum-1]; } else if
			  (array[startNum] < array[startNum + 1]){ ans[0] = array[startNum+1]; } else 
				ans[0] = array[startNum];
			  
			  if(array[startNum-1] > array[startNum]) { ans[1] = startNum - 1; } else if
			  (array[startNum] < array[startNum + 1]) { ans[1] = startNum + 1;} else
				  ans[1] = startNum;
			  //--------------------------------------------------------------------
			  startNum = ans[1];
			  //--------------------------------------------------------------------
			}
			
			return ans;
		}
		
		
}

}
