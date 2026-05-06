package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class C {
	//메소드 선언
	public void method() {
		//A 클래스에서 필드, 생성자, 메소드에 protected 접근 제한자가 붙어있기에 다른 패키지에서 접근 불가
		/*
		A a = new A();		//X
		a.field = "value";	//X
		a.method();			//X
		*/
	}
}