package newPract;

public class Reverse_Word {

	public static void main(String[] args) {
		
		String s1="Im from Pune maha.";
		String arr[]=s1.split(" ");
		String temp="";
		for(int i=arr.length-1;i>=0;i--) {
			temp=temp+" "+arr[i];
		}
		System.out.println(temp);
		
	}

}
