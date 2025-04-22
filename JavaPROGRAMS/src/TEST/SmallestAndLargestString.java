package TEST;

public class SmallestAndLargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Vision without action is a day dream";
		String words[]=s.split(" ");
		String small=words[0];
		String large=words[0];
		for(int i=0;i<words.length;i++) {
			if(words[i].length() < small.length()) {
				small=words[i];
			}
			if(words[i].length() > large.length()) {
				large=words[i];
			}
		}
		System.out.println(small);
		System.out.println(large);
		
	}

}
