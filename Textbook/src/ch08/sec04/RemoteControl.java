package ch08.sec04;

public interface RemoteControl {
	//상수 필드
	int MAX_VOLUME = 10;	// 인터페이스 선언 필드는 모두 [public static final] 특성을 가지기에 생략 가능
	int MIN_VOLUME = 0;		// 컴파일 과정에서 생략된 [public static final]가 자동으로 붙음
	
	//추상 메소드
	void turnOn();		// 인터페이스 추상 메소드는 [public abstract]를 가짐
	void turnOff();		// 컴파일 과정에서 생략된 [public abstract]가 자동으로 붙음
	void setVolume(int volume);
}