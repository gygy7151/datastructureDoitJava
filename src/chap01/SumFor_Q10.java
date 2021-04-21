package chap01;

import java.util.Scanner;
//연습문제 10번: 두변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램

public class SumFor_Q10 {

	public SumFor_Q10() {
		// TODO Auto-generated constructor stub
	}

	public static int main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;

		System.out.println("b-a의 값을 구합니다.");

		do {
			System.out.print("a의 값 : ");
			a = stdIn.nextInt();
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
		} while (b > a);

		int sum = b - a;
		return sum;

		System.out.println("b-a는" + sum + "입니다.");

	}


}

