/**
 * 
 */
package chap01;

/**
 * @author 82108
 *
 */
public class Min3m {

	/**
	 * 
	 */
	public Min3m() {
		// a,b,c의 최솟값을 구하여 반환합니다.
	}

	/**
	 * @param args
	 */
	static int min3(int a, int b, int c) {
		int min = b;
		if(a > min)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min(3,2,1) = " + min3(3, 2, 1)); // [A] a> b> c
		System.out.println("min(3,1,2) = " + min3(2, 3, 1)); // [B] b> a> c 
		System.out.println("min(2,2,1) = " + min3(2, 2, 1)); // [C] a= b> c
		System.out.println("min(2,2,1) = " + min3(2, 1, 1)); // [D] a> b =c*
		System.out.println("min(1,2,1) = " + min3(1, 2, 1)); // [E] b> a =c
		System.out.println("min(1,1,1) = " + min3(1, 1, 1)); // [F] a= b =c**
		System.out.println("min(3,1,2) = " + min3(3, 1, 2)); // [G] a> c> b
		System.out.println("min(3,1,2) = " + min3(3, 1, 2)); // [H] a> c> b
		System.out.println("min(2,1,3) = " + min3(2, 1, 3)); // [I] c> a> b
		System.out.println("min(2,2,1) = " + min3(2, 2, 1)); // [J] a= c> b
		System.out.println("min(2,1,1) = " + min3(2, 1, 1)); // [K] a> c =b*
		System.out.println("min(1,1,2) = " + min3(1, 1, 2)); // [L] c> a =b
		System.out.println("min(1,1,1) = " + min3(1, 1, 1)); // [M] a =c =b**		
	}
	
}
