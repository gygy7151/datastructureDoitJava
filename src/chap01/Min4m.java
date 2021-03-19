/**
 * 
 */
package chap01;

/**
 * @author 82108
 *
 */
public class Min4m {

	/**
	 * 
	 */
	public Min4m() {
		// a,b,c,d의 최솟값을 구하여 반환합니다.
	}

	/**
	 * @param args
	 */
	static int min4(int a, int b, int c, int d) {
		int min = b;
		if(a > min)
			min = b;
		if(min > c)
			min = c;
		if(min> d)
			min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min(4,3,2,1) = " + min4(4, 3, 2, 1)); // [A] a> b> c> d
		System.out.println("min(4,3,1,2) = " + min4(4, 3, 1, 2)); // [B] a> b> d> c 
		System.out.println("min(3,2,1,1) = " + min4(3, 2, 1, 1)); // [C] a> b> c= d *
		System.out.println("min(4,3,1,1) = " + min4(4, 3, 1, 1)); // [D] a> c> b= d *
		System.out.println("min(2,1,3,1) = " + min4(2, 1, 3, 1)); // [E] c> a> b= d 
		System.out.println("min(2,1,2,1) = " + min4(2, 1, 2, 1)); // [F] c= a> b= d
		System.out.println("min(4,3,1,3) = " + min4(4, 3, 1, 3)); // [G] a> b= d> c
		System.out.println("min(3,4,1,2) = " + min4(3, 4, 1, 2)); // [H] b> a> d> c
		System.out.println("min(3,3,1,2) = " + min4(3, 3, 1, 2)); // [I] a= b> d> c
		System.out.println("min(3,2,1,1) = " + min4(3, 2, 1, 1)); // [J] a> b> d= c* 
		System.out.println("min(3,4,1,1) = " + min4(3, 4, 1, 1)); // [K] b> a> d= c
		System.out.println("min(2,2,1,1) = " + min4(2, 2, 1, 1)); // [L] a= b> d= c
	
	}
	
}
