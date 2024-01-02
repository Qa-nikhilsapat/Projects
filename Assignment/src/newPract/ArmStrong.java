package newPract;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		//int num=153;
		int temp=num;
		int sum=0;
		int r;
		while(num!=0) {
			r=num%10;
			sum=sum +(r*r*r);//27 125 1
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Its ArmStrong");
		}else {
			System.out.println("Not ArmStrong");
		}

	}

}
