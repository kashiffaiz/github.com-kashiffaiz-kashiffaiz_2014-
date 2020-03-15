package com.program;
	import java.util.HashMap;
	import java.util.Map;
	public class Example1 {
		public static void main(String[] args) {
			String s1="foo";
			String s2="bar";
			System.out.println("is "+s1 +" and "+s2 +" are one-to-one character mapping?" +isOnetoOnemapping(s1,s2));
		}
		 public	static boolean isOnetoOnemapping(String s1,String s2){
				
				if(s1==null||s2==null ||s1.length()!=s2.length())
				return	false;
				Map<Character,Character> map=new HashMap<>();	
				int n =s1.length();
				for(int i=0;i<n;i++) {
					
					char c1=s1.charAt(i);
					char c2=s2.charAt(i);
					if(map.containsKey(c1)) {
						if(map.get(c1)!=c2)  
					return	false;	
					}
					else {
						if(map.containsValue(c2)) 
								return false;
						map.put(c1, c2);
					}
				}
				return true;
		 }}

