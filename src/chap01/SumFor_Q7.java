//연습문제 Q7번: n이 7이면 '1+2+3+4+5+6+7 = 28'로 출력하는 프포르갬 작성하라
package chap01;
import java.util.Scanner;

public class SumFor_Q7 {

	public SumFor_Q7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Scanner stdIn = new Scanner(System.in);
		
		
		// System.out.println("1부터 까지의 합을 구합니다.");
		// System.out.print("n 의값: ");
		// int n = stdIn.nextInt();
		
		int sum = 0; 			//합
		
		for (int i = 1; i <= 7; i++)
			sum += i;			//sum에 i를 더합니다.
		
		System.out.println("1부터 7까지의 합은 " +sum + "입니다.");

	}


}

