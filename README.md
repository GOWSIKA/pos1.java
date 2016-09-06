import java.io.*;
import java.util.Scanner;


public class natural {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		while(n>0)
		{
		int temp=n%10;
		a=a+temp;
		n=n/10;
		}
		System.out.println("Sum of Digit"+a);
		
	}

}
