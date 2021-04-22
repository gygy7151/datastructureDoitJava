//연습문제 10번: 두변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램
package chap01;

import java.util.Scanner;

public class SumFor_Q10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("b-a 값을 구합니다.");
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		
		
		// do문은 루프 본문을 한번 실행한 다음 계속 반복할지 판단하는 사후 판단 반복문임.
		// while문과 마찬가지로 ()안의 제어식을 평가한 값이 0이 아니면 루프 본문명령문 반복되는 구조임.
		// n이 0보다 클 때까지 반복한다.
		do {
			System.out.println("a보다 큰값을 입력하세요!");
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
			//do문while(제어식)
			//while문이나 for문과 다리 이구문 끝에는 세미콜론(;)을 붙인다.
		} while (b <= a);
		
		int sum = b-a;
		
		System.out.println("b-a의" + sum + "입니다.");

	}



}

//b-a 값을 구합니다.
//a의 값 : 1
//a보다 큰값을 입력하세요!
//b의 값 : 1
//a보다 큰값을 입력하세요!
//b의 값 : 1
//a보다 큰값을 입력하세요!
//b의 값 : 1
//a보다 큰값을 입력하세요!
//b의 값 : 0
//a보다 큰값을 입력하세요!
//b의 값 : 5
//b-a의4입니다.


