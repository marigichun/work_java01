package inheritance.abstratinterface;

public interface Connectable {
	//상수 정의
	/*public abstract*/ static final String name = "연결 방법: USB";
	//private static final String name = "연결 방법: USB"; 오류 인테페이스는 무조건 공개되야하기 때문
	//컴파일이 자동으로 선언함
	//추상 메소드 선언
	public abstract void connect();
}
