package khie;

/*
 * [문제] 이름과 국어점수, 영어점수, 수학점수, 자바점수를 
 *            키보드로 입력을 받아서 성적을 처리해 보자.
 *            총점, 평균까지 출력해 보자.
 */
public class Exam_01 {

	public static void main(String[] args) {
		
		// 1. 키보드로 이름, 국어,영어,수학,자바 점수 입력
		String name = args[0];      // 이름을 키보드로 입력
		int kor = Integer.parseInt(args[1]);     // 국어점수를 키보드로 입력
		int eng = Integer.parseInt(args[2]);    // 영어점수를 키보드로 입력
		int mat = Integer.parseInt(args[3]);   //  수학점수를 키보드로 입력
		int java  = Integer.parseInt(args[4]);  // 자바점수를 키보드로 입력
		
		// 2. 총점을 구하자.
		//     총점 = 국어 + 영어 + 수학 + 자바 
		int total = kor + eng + mat + java;
		
		// 3. 평균을 구하자
		//     평균 =  총점 / 과목수
		double avg  = total / 4.0;
		// float avg = total / 4.0f;
		
		// 화면에 성적을 출력해 주자.
		
		System.out.println("  이   름 : " + name);
		System.out.println("  국어점수 : " + kor + "점");
		System.out.println("  영어점수 : " +eng + "점");
		System.out.println("  수학점수 : " +mat +  "점");
		System.out.println("  자바점수 : " +java +  "점");
		System.out.println("  총  점  : " + total +  "점");
		System.out.printf("  평 균  : %.2f 점\n " , avg );
		
		
		
		
		
		
		
		
		
				

	}

}
