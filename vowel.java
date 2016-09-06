import java.io.*;
import java.util.Scanner;


public class vowel {

	public static void main(String[] args)
	{
		
    Scanner sc=new Scanner(System.in);
 
     char c=sc.next().charAt(0);
   
    if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
    {
    	System.out.println("Character is vowel");
    }
    else
    {
    	System.out.println("charcter is not vowel");
    }
	}

}
