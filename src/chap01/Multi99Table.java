package chap01;
// 곱셈표를 출력한다.

public class Multi99Table {

	public Multi99Table() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("-----곱셈표-----");
		
		// 다중루프
        // 반복안에서 다시 반복수행 가능
        // 이중, 삼중루프까지 존재
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++)
				System.out.println(i * j);
			System.out.println();
		}

	}

}
