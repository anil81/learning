package com.string;

public class CompareString {

	public static void main(String[] args) {
		String s = "hello";
		
		if(s.equals("hello")) {
			System.out.println("Hello");
			s = null;
		} 
		
		if(s.equals("hi")) {
			System.out.println("hi");
			s = "hello";
		}
	}

}
