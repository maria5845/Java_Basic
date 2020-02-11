package object;

import java.util.Scanner;

class MemberPhone{
	private String name;
	private String phone;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 하세요 : ");
		name=sc.nextLine();
		
		System.out.print("전화를 입력하세요 : ");
		phone=sc.nextLine();
		sc.close(); 
		//메모리 누수 방지 (Scanner 를 이용할 시 적용, 사실 BufferedReader 때도 사용하는게 좋다)
	}
	public void output() {
		System.out.println(name+" 고객님의 전화번호는 "+phone+" 입니다");
	}
}

public class ObjectEx6 {
	public static void main(String[] args) {
		MemberPhone mp=new MemberPhone();
		mp.input();
		mp.output();
		
	}
}
