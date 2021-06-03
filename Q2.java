package Testing;

public class Q2 {

	public static void main(String args[]) {

		String str = "MyString";
		int len = str.length();
		int rotate = 2;
		int diff = len - rotate;
		
		String ans = str.substring(diff) + str.substring(0, diff);
		
		System.out.println("ans: "+ans);
	}

}
