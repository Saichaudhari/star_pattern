package Star_Pattern;

import java.util.Scanner;

public class Example2
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows>>");
		int n=sc.nextInt();
		//n=3
		for(int i=1;i<=n;i++) { //i=1
			 for(int j=n; j>=i ;j--) 
			 { //
				 System.out.print("*");
			 }
			 System.out.println();
		}
		//i++
	}

}
