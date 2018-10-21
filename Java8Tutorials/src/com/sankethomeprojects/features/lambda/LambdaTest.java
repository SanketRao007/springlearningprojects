package com.sankethomeprojects.features.lambda;

import java.io.File;
import java.io.FileFilter;

public class LambdaTest {

	public static void main(String[] args) {

		// Anonymous class
//		FileFilter exeFilter = new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.getName().contains(".exe");
//			}
//		};
		
		FileFilter exeFilter = (File pathname) -> pathname.getName().contains(".exe");
		
		String dir = "D:\\games";

		File dirFile = new File(dir);
		File[] files = dirFile.listFiles(exeFilter);
		
		
		for(File f : files) {
			System.out.println(f.getName());
		}
	}

}
