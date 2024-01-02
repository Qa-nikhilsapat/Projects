package newPract;

public class Max {

	public static void main(String[] args) {
		int array[] = {10,20,45,87,65,12};
		int max=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}System.out.println(max);

	}

}
