/**
 * 
 */
package chap01;

/**
 * @author 82108
 *
 */
public class Max3m {

	/**
	 * 
	 */
	public Max3m() {
		// a,b,c의 최댓값을 구하여 반환합니다.
	}

	/**
	 * @param args
	 */
	static int max3(int a, int b, int c) {
		// TODO Auto-generated method stub
		int max = a;
		if(b > max)
			max = b;
		if(c > max)
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max(3,2,1) = " + max3(3, 2, 1)); // [A] a> b> c
		System.out.println("max(3,2,2) = " + max3(3, 2, 2)); // [B] a> b =c
		System.out.println("max(3,1,2) = " + max3(3, 1, 2)); // [C] a> c> b
		System.out.println("max(3,1,3) = " + max3(3, 1, 3)); // [D] a= c> b
		System.out.println("max(3,3,1) = " + max3(3, 3, 1)); // [E] a= b> c
		System.out.println("max(3,3,3) = " + max3(3, 3, 3)); // [F] a= b= c
		System.out.println("max(2,2,3) = " + max3(2, 2, 3)); // [G] c> a =b
		System.out.println("max(2,1,3) = " + max3(2, 1, 3)); // [H] c> a> b
		System.out.println("max(1,2,3) = " + max3(1, 2, 3)); // [I] c> b> a
		System.out.println("max(1,3,3) = " + max3(1, 3, 3)); // [J] c= b> a
		System.out.println("max(3,2,3) = " + max3(3, 2, 3)); // [K] c= a> b
		System.out.println("max(1,3,1) = " + max3(1, 3, 1)); // [L] b= a> c
		System.out.println("max(1,3,3) = " + max3(1, 3, 3)); // [M] b= c> a
		System.out.println("max(3,3,3) = " + max3(3, 3, 3)); // [N] b= c =a
		System.out.println("max(1,3,2) = " + max3(1, 3, 2)); // [O] b> c> a
		System.out.println("max(2,3,1) = " + max3(2, 3, 1)); // [O] b> a> c
		System.out.println("max(2,3,2) = " + max3(2, 3, 2)); // [O] b> a= c
		System.out.println("max(3,3,3) = " + max3(3, 3, 3)); // [K] c= a= b

		
	}

}
