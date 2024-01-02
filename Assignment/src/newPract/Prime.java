package newPract;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		//int num=23;
		int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
				if(num%i ==0) {
					count++;
				}}
				if(count ==2) {
					System.out.println("Its prime");
				}else {
					System.out.println("not prime");
				}
		}else {
			
		}

	}

}
