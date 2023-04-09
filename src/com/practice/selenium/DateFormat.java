package com.practice.selenium;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		
		
		
		String pattern = "dd-MM-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		
		String pattern1 = "MM-yyyy-dd";
		SimpleDateFormat simpd = new SimpleDateFormat(pattern1);
		String date1 = simpd.format(new Date());
		System.out.println(date1);
		
		
		String pattern2 = "dd-MM-yyyy";
		SimpleDateFormat simpD = new SimpleDateFormat(pattern2);
		String date3 =simpD.format(new Date());
		System.out.println(date3);
		
	}

}
