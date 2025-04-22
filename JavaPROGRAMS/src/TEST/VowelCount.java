package TEST;

public class VowelCount {
public static void main(String args[]) {
	int Vcount=0,Ccount=0;
	String s="India is my country";
	String str=s.toLowerCase();
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='a' ||ch =='e' || ch=='i' || ch=='o' || ch=='u') {
			Vcount++;
		}
		else if(ch>='a' && ch<='z') {
			Ccount++;
		}
		
	}
	System.out.println("Vowel : "+Vcount);
	System.out.println("Consonent : "+Ccount);
}
}
