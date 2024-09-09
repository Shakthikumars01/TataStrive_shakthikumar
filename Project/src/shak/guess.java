package shak;

import java.util.Scanner;
import java.util.Random;

public class guess {
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	Random ra = new Random();
	System.out.println("Enter the number :");
	int a = sc.nextInt();
	int b=ra.nextInt(10000);
	if(a==b)
	{
		System.out.println("congrats!! you won");
	}else 
	{
		System.out.println("Sorry!!!!better luck next time");
	}

}
}
 