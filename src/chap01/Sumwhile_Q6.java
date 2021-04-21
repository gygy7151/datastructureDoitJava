package chap01;

import java.util.Scanner;


//연습문제 Q6

public class Sumwhile_Q6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;  //
		int i = 1;
		
		while (i <= n) { // i가 n이하면 반복합니다.
			sum += i;  //sum에 i를 더합니다. 
			i++;   //i값을 1만큼 증가시킵니다.
			
//			System.out.println("1부터 " + (i-1) + "까지의 합은 " + (i-1) + "번째의 " + sum + "입니다." ); 
			//변수 i값이 n+1이 됨을 확인하는코드
			//1부터 n까지의 합을 구합니다. 결과
			//n의 값 : 6
			//1부터 1까지의 합은 1번째의 1입니다.
			//1부터 2까지의 합은 2번째의 3입니다.
			//1부터 3까지의 합은 3번째의 6입니다.
			//1부터 4까지의 합은 4번째의 10입니다.
			//1부터 5까지의 합은 5번째의 15입니다.
			//1부터 6까지의 합은 6번째의 21입니다.


		}
		
		System.out.println("1부터 " + (i-1) + "까지의 합은 "+ (i-1 ) +"번째 합인 " + sum + "입니다." );
		//1부터 n까지의 합을 구합니다.
//		n의 값 : 8
//		1부터 8까지의 합은 8번째 합인 36입니다.

	}
}