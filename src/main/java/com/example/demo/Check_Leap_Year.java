package com.example.demo;

public class Check_Leap_Year {
	public static boolean checkleapYear(int year) {
		boolean flag=false;
		if(year%400==0) {
		 flag=true;
		}else if(year%100==0) {
			flag=false;
		}
		else if(year%4==0) {
			flag = true;
		}else {
			flag=false;
		}

		return flag;
	}
}
