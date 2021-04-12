package com.work.mukul.java8.custom_annotation;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(AmazonService.AMAZOM);
	}
}

enum AmazonService {
	
	AMAZOM("amazon");
	
	private String value;
	
	private AmazonService(String value) {
		// TODO Auto-generated constructor stub
		this.value = value;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
