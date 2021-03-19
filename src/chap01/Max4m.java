/**
 * 
 */
package chap01;

/**
 * @author 82108
 *
 */
public class Max4m {

	/**
	 * 
	 */
	public Max4m() {
		// a,b,c, d의 최댓값을 구하여 반환합니다.
	}

	/**
	 * @param args
	 */
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		if(d > max)
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max(4,3,2,1) = " + max4(4, 3, 2, 1)); // [A] a> b> c> d
		System.out.println("max(4,2,1,2) = " + max4(4, 3, 1, 2)); // [B] a> b > d > c
		System.out.println("max(4,3,2,2) = " + max4(4, 3, 2, 2)); // [C] a> b > c = d
		System.out.println("max(4,2,3,1) = " + max4(4, 2, 3, 1)); // [D] a> c > b > d
		System.out.println("max(4,3,3,2) = " + max4(4, 3, 3, 2)); // [E] a> c = b > d
		System.out.println("max(4,1,3,2) = " + max4(4, 1, 3, 2)); // [F] a> c > d > b
		System.out.println("max(4,2,3,2) = " + max4(4, 2, 3, 2)); // [G] a> c > d = b
		System.out.println("max(4,2,3,3) = " + max4(4, 2, 3, 3)); // [H] a> c = d > b
		System.out.println("max(4,3,3,3) = " + max4(4, 3, 3, 3)); // [I] a> c = d = b
		System.out.println("max(4,4,2,3) = " + max4(4, 4, 2, 3)); // [J] a = b > d > c
		System.out.println("max(4,4,4,4) = " + max4(4, 4, 4, 4)); // [K] a = b =c = d *
		System.out.println("max(4,3,4,2) = " + max4(4, 3, 4, 2)); // [L] a = c > b > d
		System.out.println("max(4,4,4,3) = " + max4(4, 4, 4, 3)); // [M] a =c = b > d
		System.out.println("max(4,2,4,3) = " + max4(4, 2, 4, 3)); // [N] a =c > d > b
		System.out.println("max(4,2,4,2) = " + max4(4, 2, 4, 2)); // [O] a =c > d = b
		System.out.println("max(4,3,4,4) = " + max4(4, 3, 4, 4)); // [O] a = c = d > b
		System.out.println("max(4,4,4,4) = " + max4(4, 4, 4, 4)); // [O] a = c = d = b *


		
	}

}
