package 문제;

public class p1 {
public static void main(String[] args) {
	//문제 1
	/*
	 * 
	 * [문제1] 급여명세서를 작성하시오
  		조건1) 기본급이 1500000원,수당이 55000원,세금은 기본급의 10%
            pay=1500000 / tpay=55000 / tax=0.1  
  		조건2) 실수령액 = 기본급 + 시간수당 - 세금
           
		[출력화면] 
		실수령액 : 1405000원
	 * */
	
	int pay=1500000, tpay=55000;
	double tax=0.1;
	
	System.out.println("실수령액 : "+(int)(pay+tpay-(pay*tax))+"원");
	
		/*
		 * [문제2] 각각변수에 대입하여 출력하시오 조건1) data는 이효리, 개발부, 대리, 1500000로 대입 변수명은 각각
		 * name,dept,position,sal로 할것 조건2)출력은 아래와 같은 메서드(함수)를 이용하시오
		 * 
		 * [출력화면] 이름 : 이효리 ---> println 부서 : 개발부 ---> printf 직위 : 대리 ---> print 1번만써서
		 * 직위,급여출력 급여 : 1500000원
		 */
	String name="이효리",dept="개발부",position="대리";
	int sal=1500000;
	
	System.out.println("이름 : "+name);
	System.out.printf("부서 : %s",dept);
	System.out.print("\n직위 : "+position+"\n급여 : "+sal);
	
	
		/*
		 * [문제3] 다음 값을 각각 대입하여 출력하시오 
		 * (name : 민들래 / kor : 90 / eng : 70 / mat : 75)
		 * 
		 * [출력화면] 이름 : 민들래 합계점수 : 235점 평균점수 : 78.3 <-- 소수 1자리까지출력하시오
		 */
	String name2="민들래";
	int kor= 90,eng=70,mat=75;
	System.out.println("\n\n\n이름 : "+name2+"  합계점수"+(kor+eng+mat)+"  평균점수"+(kor+eng+mat/3));
	}
}
