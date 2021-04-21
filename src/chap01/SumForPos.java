package chap01;

import java.util.Scanner;

public class SumForPos {

	public SumForPos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		// do문은 루프 본문을 한번 실행한 다음 계속 반복할지 판단하는 사후 판단 반복문임.
		// while문과 마찬가지로 ()안의 제어식을 평가한 값이 0이 아니면 루프 본문명령문 반복되는 구조임.
		// n이 0보다 클 때까지 반복한다.
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
			
			//do문while(제어식)
			//while문이나 for문과 다리 이구문 끝에는 세미콜론(;)을 붙인다.
		} while (n <= 0);
		
		int sum = 0;	// 합
		
		for (int i = 1; i <= n; i++)
			sum += i;		// sum에 i를 더한다.
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

}

//1부터 n까지의 합을 구합니다.
//n의 값 : 0
//n의 값 : 0
//n의 값 : -1
//n의 값 : 3
//1부터 3까지의 합은 6입니다.
