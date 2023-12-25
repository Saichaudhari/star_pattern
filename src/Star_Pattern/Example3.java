package Star_Pattern;

import java.util.Scanner;

public class Example3
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows>>");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) //n=4
		{
		     //space
			 for(int j=n-1; j>=i ; j--)
			 {
			       System.out.print(" ");
			 }
			
			//star
			for(int k=1;k<=i ; k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
