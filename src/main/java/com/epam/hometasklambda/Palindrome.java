package com.epam.hometasklambda;
import java.util.ArrayList;
public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();
		s.add("MADAM");
		s.add("RADAR");
		s.add("TEACHER");
		s.add("STRING");
		s.add("NOON");
		s.add("MOON");
		s.add("NAME");
		s.add("RADAR");
		s.forEach(item-> {
			StringBuilder sb = new StringBuilder(item);
			if(sb.reverse().toString().equals(item)) {
				System.out.println("Palindromes in the list are : "+item);
			}
		});
	}

}
