package khie;

/*
 * [문제] 임의의 숫자 하나를 키보드로부터 입력을 받아서
 *             그 숫자의 제곱과 세제곱을 구해 보자.
 */
public class Exam_02 {

	public static void main(String[] args) {
		
		
		// 1. 임의의 숫자 하는를 키보드로부터 입력받자.
		int su = Integer.parseInt(args[0]); 
		
		System.out.println("입력받을 정수" + su);
		
		// 2. 임의의 숫자의 제곱을 구해야한다.
		// 형식) 임의의 숫자 * 임의의 숫자
	    System.out.println(su + "의 제곱 >>>" + (su * su));
	    System.out.println();
		
		// 3. 임의의 숫자 세제곱을 구해야한다.
		// 형식) 임의의 숫자 * 임의의 숫자 * 임의의 숫자
	    
	    System.out.println(su + "의 제곱 >>>" + ( su * su * su));
	    System.out.println();
	}

}
