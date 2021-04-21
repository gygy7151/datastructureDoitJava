package chap01;

import java.util.Scanner;


//연습문제 Q9

public class Sumwhile_sub3 {				
	static int sumof(int a, int b) {
			
			int sum = 0;
			
			if (a > b) {
				
				for (int i = b; i <= a; i++)
					sum +=i;
				
			}else if (a < b) {
				for (int i = a; i <= b; i++)
					sum +=i;
				
			}
			return sum;

		
		}
	
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			
			System.out.println("a와 b를 포함하여 그사이 모든 정수의 합을 구합니다.");
			System.out.print("a의 값 : ");
			int a = stdIn.nextInt();
			System.out.print("b의 값 : ");
			int b = stdIn.nextInt();
			
			System.out.println("a와 b를 포함한 그사이의 정수의 합" + sumof(a,b) + "입니다.");
		}
	}


// 첫번째 접근
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
// => 결과 안나옴

// 두번째 방법
//		if (a > b)  {
//int sum = b;
//int i = b;
//
//while (i <= a) {
//	sum += i;  //sum에 i를 더합니다. 
//	i++; 
//	return;
//}
//
//System.out.println("a와 b사이의 모든 정수의 합은" + sum + "입니다." );
//
//
//} else if (b < a) {
//	int sum = a;
//	int i = a;
//	
//	while (i <= b) {
//		sum += i;
//		i++;
//		return;
//	}
//	
//	System.out.println("a와 b사이의 모든 정수의 합은" + sum + "입니다." );

