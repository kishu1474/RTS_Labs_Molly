package Testing;

public class Q1 {

	public static void main(String args[]) {

		int a[] = { 1, 5, 2, 1, 10 };
		int l = a.length;
		int b = 6;
		
		int c_high = 0;
		int c_low = 0;
		
		for(int i = 0; i < l; i++) {
			
			if (a[i] == b) {
				
			}
			else {			
				if (a[i] < b) {
					c_low++;
				}
				else {
					c_high++;
				}
			}
		}
		
		System.out.println("above: " + c_high + ", below: " + c_low);

	}

}
