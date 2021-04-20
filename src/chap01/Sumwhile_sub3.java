package chap01;

import java.util.Scanner;


//연습문제 Q6

public class Sumwhile_sub3 {		
	static void sumof(int a, int b) {
		if (a > b)  {
			int sum = b;
			int i = b;
			
			while (i <= a) {
				sum += i;  //sum에 i를 더합니다. 
				i++; 
				return;
			}
			
			System.out.println("a와 b사이의 모든 정수의 합은" + sum + "입니다." );
			
			
		} else if (b < a) {
				int sum = a;
				int i = a;
				
				while (i <= b) {
					sum += i;
					i++;
					return;
				}
				
				System.out.println("a와 b사이의 모든 정수의 합은" + sum + "입니다." );
				
			}

		}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a와 b사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		
	}
//		if (a > b) {
//			int n = b;
//			int sum = b;
//			int i = n;
//			
//			while (i <= a) {
//				sum += i;  //sum에 i를 더합니다. 
//				i++; 
//			}
//		} else if(a < b) {
//			int n = a;
//			int sum = a;
//			int i = n;
//			
//			while (i <= b) {
//				sum += i;
//				i++;
//			}
//		}
		//1부터 n까지의 합을 구합니다.
//		n의 값 : 8
//		1부터 8까지의 합은 8번째 합인 36입니다.

}
