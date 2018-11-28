
public class Question6 {

	public static void main(String[] args) {
	
		System.out.println("m = 7, n = 10: " + gcd(7, 10) +
				"\nm = 50 n = 32: " + gcd(50, 32) + 
				"\nm = 89 n = 43: " + gcd(89, 43));

	}
	public static int gcd(int n, int m){
		if(n <= 0 || m <= 0) {
			throw new 
				IllegalArgumentException("Please Choose a Number "
						+ "greater than 1");
		}
		if(m == n)
			return n;
		else if(m > n) 
			return gcd(m-n, n);
		else 
			return gcd(m, n-m);
		
	}


}
