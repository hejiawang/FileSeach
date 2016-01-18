package com.run.wang.fileseach.utils.test;

import java.io.File;

import org.junit.Test;

/**
 * 
 * @author wang
 * @data 2016年1月14日 下午7:55:18
 */
public class FileUtilTest {

	private void showFileSons( File[] files  ){
		if( files == null ){//如：cd驱动器有盘符，当没有光盘放入时，files为空，
			return;
		}
		for( int j=0; j<files.length; j++ ){
			File file = files[j];
			if( file.isDirectory() ){
				File[] filess = file.listFiles();
				showFileSons(filess);
			} else {
				System.out.println(file.getAbsolutePath());
			}
		}
	} 
	
	@Test
	public void test() {
		
		File[] fileRoots = File.listRoots();//得到计算机根目录，如：win系统中C:\  D:\  Linux系统中  \
		for( int i=0; i<fileRoots.length; i++ ){
			File fileRoot = fileRoots[i];	//  如   C:\
			System.out.println(fileRoot.getAbsolutePath());
			
			File[] files = fileRoot.listFiles();
			showFileSons(files);
		}
	}
}
