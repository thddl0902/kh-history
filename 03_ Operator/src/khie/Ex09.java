package khie;

// 키보드로부터 두 개의 숫자를 입력을 받자.
// 입력 받은 두 수를 이용하여 산술연산을 진행해 보자.

public class Ex09 {

	public static void main(String[] args) {
		
		
		// 1. 키보드로부터 두 개의 숫자를 입력을 받자.
		//     입력 받은 두 수를 숫자로 변환을 시키자.
		String su1 = args[0];
		String su2 = args[1];
	
		
		int num1 =	Integer.parseInt(su1);   // int num1 =  Integer.parseInt(args[0]); 
		int num2 =	Integer.parseInt(su2);  //  int num2 =  Integer.parseInt(args[1]); 
		
		// 입력받은 두수를 산술연산을 해보자.
		
		System.out.println("덧셈>>>" +  ( num1 + num2));
		System.out.println();
		
		
		System.out.println("뺄셈>>>" +  ( num1 - num2));
		System.out.println();
		
		System.out.println("곱셈 >>> " +  ( num1 * num2));
		System.out.println();
	
		System.out.println("나눗셈 >>> " +  ( num1 * num2));
		System.out.println();
		
		System.out.println("나머지 >>> " +( num1 & num2));
		System.out.println();
		
		
		
		
		// 1. 키보드로부터 두 개의 숫자를 입력을 받자.
		//     입력 받은 두 수를 숫자로 변환을 시키자.
		
	
				
				
	}

}
