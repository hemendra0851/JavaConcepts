package programs;

import java.util.Scanner;

public class CountX {

	public static void main(String[] args) {

		int x, l, u;
		int c = 0;
		int rem = 0;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the x value");
		x = s.nextInt();
		
		System.out.println("Enter the lower bound value");
		l = s.nextInt();
		
		System.out.println("Enter the upper bound value");
		u = s.nextInt();
		
		for(int i = l+1; i < u; i++){
			
			int t = i;
			while(t>0){
				
				rem = t%10;
				if(rem == x)
					c++;
				t = t/10;
			}
		}
		
		System.out.println("No of occurence of "+x+" is "+c);
		s.close();
	}

}
