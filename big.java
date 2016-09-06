import java.io.*;
import java.util.Scanner;


public class largestthree {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if((a>b)&&(a>c))
		{
		System.out.println(a+"a is big");
		
		}
		else if(b>c)
		{
			System.out.println(b+"b is big");
		}
		else
		{
			System.out.println(c+"c is big");
		}
	}

