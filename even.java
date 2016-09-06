import java.io.*;
import java.util.Scanner;


public class evenodd {

	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int c=a%2;
	if(c==0)
	{
		System.out.println(a+"is Even Number");
	}
	else
	{
		System.out.println(a+"is Odd number");
	}
	}

}

