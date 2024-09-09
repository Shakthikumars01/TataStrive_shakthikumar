package shak;
import java.util.Scanner;

public class javalab {

	public static void main(String[] args) {
		Scanner an=new Scanner(System.in);
		System.out.println("Enter your Lottery number: ");
		int b=an.nextInt();
		if(b==100||b==200||b==300||b==400){
			System.out.println("congrats!!!you won the lottery");
		}
		else {
			System.out.println("sorry!!!you lose");
		}
	
			System.out.println();
		
		
	}

}
