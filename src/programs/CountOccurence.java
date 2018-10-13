package programs;

import java.util.ArrayList;
import java.util.Scanner;

public class CountOccurence {

	public static void main(String[] args) {
		
		String foo = "";
		int i, j, count;
		char x[];

		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
		
		//Input String
		foo = s.nextLine();
		//Convert to Char Array
		x = foo.toCharArray();
			
		ArrayList<Character> chars = new ArrayList<Character>();	//Array to store distinct characters
		ArrayList<Integer> c = new ArrayList<Integer>();	//Array to store count of each distinct char
		
		for (i = 0; i < x.length; i++)
		{
			count = 0;
			
			for (j = i; j < x.length; j++)
			{
				if (x[j] == x[i])
					count++;
			}
				//To add distinct chars and its to new Array
				if(!chars.contains(x[i]))
				{
					chars.add(x[i]);
					c.add(count);
				}
				
		}
		
		System.out.println("Total no of Unique Characters = "+chars.size());
		
		//Print the count
		for(i=0; i < chars.size(); i++)
		{
			System.out.println("Count of "+chars.get(i)+" is "+c.get(i));
		}
		
		s.close();
	}
}

