package chap01;

import java.util.Scanner;

public class JudgeSign {

	public JudgeSign() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요:");
		int n = stdIn.nextInt();
		
		if(n > 0)
			System.out.println("이 수는 양수입니다.");
		else if (n < 0)
			System.out.println("이 수는 음수입니다.");
		else
			System.out.println("이 수는 0입니다.");
		
//		if(n == 1)
//			System.out.println("이 수는 1입니다.");
//		else if (n == 2)
//			System.out.println("이 수는 2입니다.");
//		else
//			System.out.println("이 수는 3입니다.");
		

	}

}
