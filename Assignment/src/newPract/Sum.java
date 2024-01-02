package newPract;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Sum a=new Sum();
		a.ArraySum();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		//int num=1234;
		int sum=0;
		while(num!=0) {
			int r =num%10;
			sum=sum+r;
			num=num/10;
		}
		System.out.println(sum);
	}
	public void ArraySum() {

		int[]num1 = {10,20,39,43};
		int sum1=0;
		//System.out.println(num1.length);
		for(int i=0;i<num1.length;i++) {
			sum1=sum1+num1[i];
		}
		System.out.println(sum1);
	}
	
	
	

}
