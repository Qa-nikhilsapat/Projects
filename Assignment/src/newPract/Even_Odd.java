package newPract;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("its Even number");
		}else {
			System.out.println("its Odd number");
		}

	}

}
