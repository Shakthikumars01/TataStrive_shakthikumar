package shak;
import java.util.Scanner;
public class pnz {

	public static void main(String[] args) {
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter the number: ");
			int a=ab.nextInt();
	if(a>0) {
	System.out.println(a + " is a positive number");	
	}
	else if(a<0){
		System.out.println(a + " is a negative number");
	}
	else {
		System.out.println(a + "  is zero");
	}
	}

}
