package 문제;
/*
 * [문제14]다음 2개의 파일을 만들어 프로그램을 만드시오
(1) package명은 test14로 하고 Emp.java   EmpEx.java파일을 만드시오
(2) 파일명 : Emp  --main()포함 X
+name:String
+age:int
+tall:double
+setEmp(name:String, age:int, tall:double):void
+viewEmp():void
          
(3) 파일명 : EmpEx   --main()포함 O
Emp ob=new Emp();
ob.setEmp("이순신", 25, 175.3);
ob.viewEmp();

(4) 출력화면
나의 이름은 이순신이며, 25살이고 키는 175.3cm입니다
*/
public class 문제14 {
public static void main(String[] args) {
	Emp ob=new Emp();
	ob.setEmp("이순신", 25, 175.3);
	System.out.println(ob.viewEmp());
	}
}
