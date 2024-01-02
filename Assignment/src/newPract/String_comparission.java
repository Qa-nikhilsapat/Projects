package newPract;

public class String_comparission {

	public static void main(String[] args) {
		String s1="nikhil";
		String s2="nikhil";
		System.out.println(s1.equals(s1));
		
		if(s1.compareTo(s2)==0) {
			System.out.println("equal");
		}else
			System.out.println("not");

	}

}
