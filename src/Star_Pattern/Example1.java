package Star_Pattern;

import java.util.Scanner;

public class Example1 
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows for Star pattern");
		int n=sc.nextInt();
		//rows
		for(int i=1;i<=n;i++) 
		{
			//column
			for(int j=1; j<=i ;j++) 
			{
				System.out.print("*");
			}
			//next line
			System.out.println();
		}
	}

}
