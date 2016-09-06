import java.io.*;
import java.util.Scanner;


public class year {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%4==0)
		{
			System.out.println(a+ "is leap year");
		}
		else
		{
		System.out.println(a+"Not leap year");
		}
		
     
	}

}
