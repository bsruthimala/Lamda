package com.epam.hometasklambda;
import java.util.ArrayList;
public class Alphabet {
	public static void main(String[] args) {
	ArrayList<String> str = new ArrayList<String>();
	str.add("aaa");
	str.add("abc");
	str.add("pqr");
	str.add("sruthi");	
	str.forEach (st-> {
		if(st.length()==3 && st.startsWith("a"))
			System.out.println("String with length 3 and starts with \'a\' : "+st);
	});
	}
}