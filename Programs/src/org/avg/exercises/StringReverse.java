package org.avg.exercises;

/**
 * Reverse a string with recursion
 * 
 * 
 *
 */
public class StringReverse {

	public static String str = ""	;
	public static String reverse(String inp){
		
		if(inp.length()==1) return inp;
		
		str += inp.charAt(inp.length()-1) + reverse(inp.substring(0, inp.length()-1));
		
		return str;
	}
	
	public static void main(String args[]){
		System.out.println(StringReverse.reverse("StringReverse"));
	}
	
}
