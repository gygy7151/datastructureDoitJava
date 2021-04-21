//연습문제 4. 세값의 대소관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요


/**
 * 
 */
package chap01;

import java.util.Scanner;

/**
 * @author 82108
 *
 */
public class Median_Q4 {

	/**
	 * 
	 */
	public Median_Q4() {
		// a,b,c,d의 최솟값을 구하여 반환합니다.
	}

	/**
	 * @param args
	 */
	static int med3(int a, int b, int c) {
		if(a >=b)
			if(b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}
	
	//연습문제 5. 중앙값을  구하는 메서드는 다음과 같이 작성할 수 도 있습니다. 그러나 실습  1C-1의 med3메서드에 비해 효율이 떨어지는데, 그이유를 설명하시오
	static int med3_1(int d, int e, int f) {
		if((e >= d && f <= d) || (e <=d && f >=d))
			return d;
		else if ((d > e && f < e) || (d < e && f > e))
			return e;
		return f;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("d의 값 : ");
		int d =  stdIn.nextInt();
		System.out.print("e의값 : ");
		int e = stdIn.nextInt();
		System.out.print("f의 값 : ");
		int f = stdIn.nextInt();
		System.out.println(med3_1(d, e, f));
		
		System.out.println("med3(3,2,1) = " + med3(3, 2, 1)); // [A] a> b> c
		System.out.println("med3(3,2,2) = " + med3(3, 2, 2)); // [B] a> b= c 
		System.out.println("med3(3,1,2) = " + med3(3, 1, 2)); // [C] a> c> b
		System.out.println("med3(2,1,2) = " + med3(2, 1, 2)); // [D] a= c> b
		System.out.println("med3(2,1,3) = " + med3(2, 1, 3)); // [E] c> a> b
		System.out.println("med3(3,3,2) = " + med3(3, 3, 2)); // [F] a= b> c
		System.out.println("med3(3,3,3) = " + med3(3, 3, 3)); // [G] a= b= c
		System.out.println("med3(2,2,3) = " + med3(2, 2, 3)); // [H] c> a= b
		System.out.println("med3(2,3,1) = " + med3(2, 3, 1)); // [I] b> a> c
		System.out.println("med3(2,3,2) = " + med3(2, 3, 2)); // [J] b> a= c
		System.out.println("med3(1,3,2) = " + med3(1, 3, 2)); // [K] b> c> a
		System.out.println("med3(2,3,3) = " + med3(2, 3, 3)); // [L] b= c> a
		System.out.println("med3(1,2,3) = " + med3(1, 2, 3)); // [M] c> b> a
		
		

		
	}
	
}
