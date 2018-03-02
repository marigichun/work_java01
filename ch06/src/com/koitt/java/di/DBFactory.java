package com.koitt.java.di;

public class DBFactory {
	
	public static KoittDB getDB(String type) {
		swich (type) {
			case "Ora":
				return new OraDB();
				
			case "MyS":
				return new MySADB();
		}
		
		return unll;
	}
}
