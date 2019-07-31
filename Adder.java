package homework2;

import java.util.Scanner;

public class Adder {
	public static void main(String args[]) 
	{
		System.out.println("Enter numbers you would like added together with a space inbetween and any character at the end");
		Scanner in = new Scanner(System.in);
		int var1 = in.nextInt();
		
		while(in.hasNextInt() == true) 
		{
			int var2 = in.nextInt();
			var1 = add(var1, var2);
		}
		
		System.out.println("The total is: " + var1);
	}
	
	public static int add(int x, int y)
	{
		return x+y;
	}
}
