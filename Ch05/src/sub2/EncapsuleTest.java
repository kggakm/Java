package sub2;

/**
 * 날짜 : 2026/04/29
 * 이름 : 조규현
 * 내용 : 
 */

public class EncapsuleTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 0); // 생정자 초기화
		
		
		Car avante = new Car(); // 생성자 초기화

		
		// 객체 초기화 -> 캡슐화된 속성을 생성자로 초기화
		//sonata.brand = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		
		// 속성값 수정
		//sonata.color = "은색";
		sonata.setColor("은색");
		
		// 세터 초기화
		avante.setBrand("아반테");
		avante.setColor("검정");
		avante.setSpeed(0);
		
		System.out.println("차량명 : " + avante.getBrand());
		System.out.println("차량색 : " + avante.getColor());
		System.out.println("현재속도 : " + avante.getSpeed());
				
		
		
		sonata.show();
		avante.show();
		
		// Account 객체 생성
		Account kb = new Account("국민은행", "110-11-1234", "김유신", 1000);
		Account wr = new Account("우리은행", "101-22-1001", "김춘추", 1000);
		
		kb.show();
		wr.show();
		
		// Book 객체 생성
		Book javaBook = new Book("이것이 자바다", "신용권", 5);
		javaBook.show();
		
		
		// Member 객체 생성
		Member kim = new Member("김유신", 24, false);
		
		kim.show();
		
		/*
		 문제2. 아래 요구사항을 충족하는 Movie 클래스를 정의하세요.
		 
		 <속성>
		  - title (String): 영화 제목
		  - director (String): 감독 이름
		  - rating (double): 영화 평점 (0.0 ~ 10.0 사이의 값)
		  - availableSeats (int): 예약 가능한 좌석 수
		  
		 <생성자>
		  - 모든 인스턴스 변수를 초기화하는 생성자
		  
		 <메서드>
		  reserveSeat()
		   - 예약 가능한 좌석이 있으면 availableSeats를 1 감소시키고 true를 반환
		   - 예약 가능한 좌석이 없으면 false를 반환
		  
		  cancelReservation()
		   - availableSeats를 1 증가
		  
		  showDetails()
		   - 모든 멤버 변수 값을 출력
		 */
		
		// Movie 객체 생성 및 생성자 초기화
		Movie titanic = new Movie("타이타닉", "제임스카메론", 10.0, 300);
		titanic.showDetails();
		
		Movie avatar = new Movie("아바타", "제임스카메론", 9.8, 250);
		avatar.showDetails();
		
		
		
		
		
		
		
	}

}
