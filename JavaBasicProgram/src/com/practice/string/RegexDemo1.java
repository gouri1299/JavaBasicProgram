package com.practice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("hello" );
		Matcher matcher = pattern.matcher("Hello .... how are you?");
		
		boolean res = matcher.find();
		
		if(res) {
			System.out.println("Match Found");	
		}
		else
			System.out.println("Match Not Found");
	}
	

}
