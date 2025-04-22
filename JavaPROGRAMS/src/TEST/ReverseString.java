package TEST;

public class ReverseString {
	public static void main(String args[]) {
		String s="Hello world",rev="";
		char ch[]=s.toCharArray();
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.print(rev);
	}

}
