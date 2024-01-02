package newPract;

import java.util.Scanner;

public class Reverse_PAlindrome {

	public static void main(String[] args) {
		// int num=1234;
		 
		Scanner scan= new Scanner(System.in);
		int num = scan.nextInt();
		 int temp=num;
		 int rev=0;
		 while(num!=0) {
			 rev=rev*10+num%10;
			 num=num/10;
		 }
		 System.out.println(rev);
		 if(rev==temp) {
			 System.out.println("its palindrome");
		 }else {
			 System.out.println("its not");
		 }

	}

}
