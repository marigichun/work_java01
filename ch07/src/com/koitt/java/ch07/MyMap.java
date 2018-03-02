package com.koitt.java.ch07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {
	
	private Set<K> keySet;		//key값들ㅇ르 저장하는 Set								
	private List<K> keys; 		//key값을 저장하는 배열 ( Mapping(연결)하는 배열)
	private List<V> values;		//value값을 저장하는 배열
	private int size;			//데이터의 개수
	
	public MyMap() {
		keySet = new HashSet<K>();
		keys = new ArrayList<K>();
		values = new ArrayList<V>();
	}
	
	public void put(K key, V value) {
		for(int i = 0; i < keys.size(); i++) {		//변경된 값을 적용하는 메소드
			// 이 조건이 맞으면 해당 key의 value를 수정
			if( keys.get(i).equals(key)) {
				values.set(i, value);
				return;								//void라서 끝나면 돌아가서 확인 후 종료하는 
			}
		}
			
		keySet.add(key);
		keys.add(key);
		values.add(value);
		size += 1;
	}
	public V get(K key) {
		for (int i = 0; i < keys.size(); i++) {
			if (keys.get(i).equals(key)) {
				return values.get(i);
			}
		}
		
		return null;		//참조형의 기본값으로 (27번 get(K key)
	}
	
	public Set<K> getKeySet() {
		return this.keySet;
	}
	public static void main(String[] args) {
		MyMap<String, String> map = new MyMap<String, String>();
		map.put("대한민국",  "서울");
		map.put("일본",  "동격");
		map.put("중국",  "북경");
		map.put("중국",  "북경1");
	
		//Map에 저장된 sEt(keySet)에서 순차적으로 key값을 가져온다.
		for (String key : map.getKeySet()) {
			/*
			 * 순자적올 가져운 key값을 이용해 map의  get메소드를 이용하여 
			 * 실제 value값을  가져온다.
			 */
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}	
}





