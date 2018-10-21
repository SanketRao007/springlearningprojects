package com.sankethomeprojects.features.lambda;

import java.util.Comparator;

public class ComparatorLambda {

	public static void main(String[] args) throws InterruptedException {
		
		Comparator<String> customStringComparator = (s1, s2) ->{
			return Integer.compare(s1.length(), s2.length());
		};
		
		
	}
}
