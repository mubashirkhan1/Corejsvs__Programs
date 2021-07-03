package com.java;

import java.util.Stack;

public class Stackexample {
public static void main(String[] args) {
	Stack s=new Stack();
	s.push("mubashir");
	s.push("mubashir11");
	s.push("mubashir22");
	System.out.println(s);
	System.out.println(s.search("mubashir"));
	System.out.println(s.search("mkhan"));
	
	
}
}
