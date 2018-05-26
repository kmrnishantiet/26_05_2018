package com.kumar;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

interface C{
	
	default Object clone() throws CloneNotSupportedException {
		
		return null;
	}
	
}

public class Test1 {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		Stream<Integer> s = l.parallelStream();
		s.forEach(System.out::println);
		s.forEach(Test1::doubleIt);
		
	}
	
	public static int doubleIt(int i){
		System.out.println(i*2);
		return i*2;
	}
	
}
