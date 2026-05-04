package sub4;

/**
 * 날짜 : 2026/05/04
 * 이름 : 조규현
 * 내용 : Java 상속 실습
 */

public class InheritanceTest {
	
	public static void main(String[] args) {
		
		// Car 상속객체 Sedan 생성
		Sedan sonata = new Sedan("소나타", "은색", 0, 1800);
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.drive();
		
		// Car 상속객체 Truck 생성
		Truck bongo = new Truck("봉고", "블루", 0, 0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.show();
	}
}