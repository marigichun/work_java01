package com.koitt.java.di;

public class OraDB implements KoittDB{
	//네이터 메이스에 정보를 입력하는 메소드
	public void insert() {
		System.out.println("OraDB에 해당 정보가 입력되었습니다.");
	}
	
	public void delete() {
		System.out.println("OraDB에 해당 정보가 삭제되었습니다.");
	}
}
