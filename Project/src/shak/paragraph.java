package shak;
import java.util.Scanner;
public class paragraph {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the paragraph");
		String a=sc.nextLine();
		String[]b=a.split("java");
       int count=b.length;
       System.out.println("The word 'java appears " + count +" times");
       if(count>0) {
    	   System.out.println("Indexes of 'java': ");
       int index=0;
       for(int i=0;i<count;i++) {
    	   index+=b[i].length();
			System.out.println(index);
       if(i < count) {
    	   System.out.println(",");
       }
       index+="java".length();
       }
       }
       else {
    	   System.out.println("The word 'java' does not appear in the paragraph.");
    	   }
 }
}
