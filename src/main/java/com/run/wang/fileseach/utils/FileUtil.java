package com.run.wang.fileseach.utils;

import java.io.File;

/**
 * 
 * @author wang
 * @data 2016年1月14日 下午7:35:49
 */
public class FileUtil {
	
	public static void getFileRoots(){
		
		File[] roots = File.listRoots();
		for( int i=0; i<roots.length; i++ ){
			System.out.println(roots[i]);
		}
	}
}
