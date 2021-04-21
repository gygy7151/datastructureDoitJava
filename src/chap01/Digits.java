package chap01;

import java.util.Scanner;

public class Digits {

	public Digits() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력 : ");
			no = stdIn.nextInt();
			// 제어식에 변수no에 입력한 값이 10보다 작거나 99보다 크면 루프본문 반복 
			// '||'은 논리합연산자(하나라도 참이면 참) -> 왼쪽 또는 오른쪽등 어느 한쪽 피연산자의평가 결과만으로 정확해지는 경우
			// 논리합연산자를 통한 식결과를 '단축평가'라고 함.
			// '&&'는 논리곱연산자(둘다 참이면 참)
		} while (no < 10 || no > 99);
		
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
	}

}

//2자리의 정수를 입력하세요.
//입력 : 45
//변수 no의 값은 45가(이) 되었습니다.