/**
 * 
 */
package chap01;

import java.util.Scanner;

/**
 * @author 82108
 *
 */
public class Max3 {

	/**
	 * 
	 */
	public Max3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner (System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = stdIn.nextInt();
		System.out.print("b의 값 : "); int b = stdIn.nextInt();
		System.out.print("c의 값 : "); int c = stdIn.nextInt();
		
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.print("세 정수의 최댓 값은 " + max + " 입니다");

		

	}

}
