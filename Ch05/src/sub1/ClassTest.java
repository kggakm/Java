package sub1;

/**
 * 날짜 : 2026/04/29
 * 이름 : 조규현
 * 내용 : Java 클래스 실습
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car();		// Car <- 사용자 정의 타입
		
		// 객체 초기화
		sonata.brand = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 활용
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car();
		avante.brand = "아반테";
		avante.color = "검정";
		avante.speed = 0;
		
		avante.speedUp(60);
		avante.speedDown(10);
		avante.show();
		
		// Account 객체 생성 및 초기화
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "110-11-1234";
		kb.name = "김유신";
		kb.balance = 1000;
		
		kb.deposit(20000);
		kb.withdraw(5000);
		kb.show();
		
		/*
		 <출력>
		 은행명 : 우리은행
		 계좌번호 : 101-22-1001
		 입금주 : 김춘추
		 현재잔액 : 15000
		 */
		Account wr = new Account();
		wr.bank = "우리은행";
		wr.id = "101-22-1001";
		wr.name = "김춘추";
		wr.balance = 0;
		
		wr.deposit(30000);
		wr.withdraw(15000);
		wr.show();
		
		/*
		 문제1. 아래 요구사항을 충족하는 Book 클래스를 정의하세요.
		 
		 <속성>
		  - title (String): 책 제목
		  - author (String): 저자 이름
		  - copies (int): 이용 가능한 복사본 수
		  
		 <메서드>
		 borrowBook()
		  - 이용 가능한 복사본이 있으면 copies를 1 감소시키고 true를 반환
		  - 이용 가능한 복사본이 없으면 false를 반환
		  
		 returnBook()
		  - copies를 1 증가
		  
		 show()
		  - 모든 속성값을 출력
		 */
		
		// Book 객체 생성 및 초기화
		Book javaBook = new Book();
		javaBook.title = "이것이 자바다";
		javaBook.author = "신용권";
		javaBook.copies = 1;
		
		boolean result = javaBook.borrowBook();
		if(result) {
			System.out.println("대출 성공!!!");
			javaBook.show();
		}else {
			System.out.println("대출 실패!!!");
			javaBook.show();
		}
		
		/*
		문제 2. 회원(Member) 클래스 정의
		
		아래 요구사항을 충족하는 Member 클래스를 정의하세요.
		
		<속성>
			name (String): 회원 이름
			age (int): 나이
			isActive (boolean) : 활성 회원 여부
		
		<메서드>
			activate()
			 - isActive를 true로 변경
			
			deactivate()
			 - isActive를 false로 변경
			 
			isAdult()
			 - 나이가 20 이상이면 true, 아니면 false 반환
			
			show()
			 - 모든 속성값 출력
		 */
		
		// Member 객체 생성 및 초기화
		Member kim = new Member();
		kim.name = "김유신";
		kim.age = 24;
		kim.isActive = false;
		
		kim.activate();
		boolean isAdult = kim.isAdult();
		if(isAdult) {
			kim.show();
			System.out.println("성인 입니다.");
		}else {
			kim.show();
			System.out.println("미성년자 입니다.");
		}
	}

}

