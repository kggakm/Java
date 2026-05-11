package sub2;

/**
 * 날짜 : 2026/05/11
 * 이름 : 조규현
 * 내용 : Java 내장클래스 실습 - String
 */

public class StringTest {
	
	public static void main(String[] args) {
		
		// 문자열 = 문자 + 배열
		String str1 = "Hello";	// 암시적, 문자열 리터럴
		String str2 = new String("Hello");	// 명시적
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		// 문자열 비교
		if(str1 == str2) {
			System.out.println("str1, str2 주소값이 같다.");
		} else {
			System.out.println("str1, str2 주소값이 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열이 같다.");
		} else {
			System.out.println("str1, str2 문자열이 다르다.");
		}
		
		// 문자열 길이
		
		
		// 문자열 추출
		
		
		// 문자열 자르기
		
		
		// 문자열 인덱스
		
		
		// 문자열 분리
		
		
		// 문자열 교체
		
		
		// 문자열 변환
		
		
		
	}

}
