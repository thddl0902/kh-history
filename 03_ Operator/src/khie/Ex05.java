package khie;

/*
 * 5. 배정연산자 /  단축배정연산자.
 *       - 배정연산자 (=) 
 *           형식 ) 변수 = 변수 or 수식 or 값;
 *           * 좌변에는 항상 변수명이 와야 함.
 *           * 우변에는 숫자, 변수명, 수식이 와야 함.
 *       - 단축배정연산자
 *         * 배정연사자를 간편하게 사용하는 연산자.
 */

public class Ex05 {

	public static void main(String[] args) {
		
		//배정연산자
		//형식) 변수 = 값(숫자);
		int su1 = 10 , su2 = 28, result = 0;
		
		// 형식) 변수 = 변수;
		su1 = su2;
		
		//형식) 변수 = 수식;
		su1 = su2 + 27;
		
		System.out.println("su1 >>>" + su1);
		
		// 단축배정연산자 ==> 누적변수 사용 시 
	    // result = result + 10;      ==  		result += 10;
		
		result += 10;
		System.out.println("retsult>>>" + result);
		
		int su = 15;
		
		//su += 5 ==> su + 5;
		System.out.println("su>>>" +(su += 5));
		System.out.println();
		
		System.out.println("su>>>" +(su -= 5));
		System.out.println();
		
		System.out.println("su>>>" +(su *= 5));
		System.out.println();
		
		System.out.println("su>>>"+ (su /= 5));
		System.out.println();
		
		System.out.println("su>>>"+ (su %= 5));
		System.out.println();
		
		
		
		
		
		
		
		
	    
		
		
		
	}

}
