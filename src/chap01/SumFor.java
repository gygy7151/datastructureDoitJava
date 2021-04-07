//실습 1-5 완료
package chap01;
import java.util.Scanner;

public class SumFor {

	public SumFor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		
		System.out.println("1부터 까지의 합을 구합니다.");
		System.out.print("n 의값: ");
		int n = stdIn.nextInt();
		
		int sum = 0; 			//합
		
		for (int i = 1; i <= n; i++)
			sum += i;			//sum에 i를 더합니다.
		
		System.out.println("1부터 " + n + "까지의 합은 " +sum + "입니다.");

	}

}
