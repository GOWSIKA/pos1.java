import java.io.*;
import java.util.Scanner;


public class alphabet {

	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);	
	char c=sc.next().charAt(0);
	if((c<='z'&&c>='a')||(c<='Z'&&c>='A'))
	{
		System.out.println("CHARACTER");
	}
	else
	{
	   System.out.println("NUMBER");	
	}

	}

}
