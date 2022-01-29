package khie;


public class Ex08 {

	public static void main(String[] args) {
		
		// 키보드를 이용하여 두 개의 숫자를 입력을 받아 보자.
		String su1 = args[0];
		String su2 = args[1];
	   // 프로그램 실행시 컴퓨터 값도 똑같이 받아야함.
		
		
		System.out.println("su1 + su2 >>>" + (su1 + su2));
		System.out.println();
		
	int num1 =	Integer.parseInt(su1);    // " " 를 없애줌
	int num2 =	Integer.parseInt(su2);
	
          System.out.println("num1 + num2 >>>" + (num1 + num2));
          System.out.println();
	

	}

}
