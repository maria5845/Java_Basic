package object;
/*
 * +는 public, -는 private 를 의미
 * 
 * 클래스명 : Emp
 * -name:String
 * -dept:String
 * -salary:int
 * 
 * +setEmp(name:String,dept:String,salary:int):void
 * +printEmp():void
 *
 * 
 * --홍길동 사원은 개발부에 근무하며 1520000원의 급여를 받아요
 * 
 * 
 * */
class Emp{
	private String name;
	private String dept;
	private int salary;
	
	public void setEmp(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
	public void printEmp() {
		System.out.println(name+"사원은 "+dept+"에 근무하며 "+salary+"원의 급여를 받아요");
	}
}
public class ObjectTest1 {
	public static void main(String[] args) {
		Emp em=new Emp();
		em.setEmp("홍길동", "개발부", 1520000);
		em.printEmp();
	}
}
