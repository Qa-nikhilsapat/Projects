package newPract;

public class Occurence {

	public static void main(String[] args) {
		
//		String string="nikhil sapat";
//		int totalLength= string.length();
//		
//		
//		int newLength= string.replace("a", "") .length();
//		
//		int count = totalLength-newLength;
//		System.out.println("Occurence  is: "+count);
		
		occurence("nikhilSapat","S");
	}
	public static void occurence(String abc,String a) {
		String string=abc;
		int totalLength= string.length();
		
		int newLength= string.replace(a, "") .length();
		
		int count = totalLength-newLength;
		System.out.println("Occurence  is: "+count);
	}

}
