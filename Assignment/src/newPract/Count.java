package newPract;

public class Count {
	public static void main(String[] args) {
		int num=4587;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("count is: "+count);
	
	}
}
