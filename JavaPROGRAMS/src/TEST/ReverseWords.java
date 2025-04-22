package TEST;

import java.util.Scanner;

public class ReverseWords {
public static void main(String args[]) {
	System.out.println("enter text : ");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String in[]=s.split(" ");
	for(int i=in.length-1;i>=0;i--) {
		System.out.print(in[i]+" ");
	}
}
}
