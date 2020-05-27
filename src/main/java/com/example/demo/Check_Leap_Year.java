package com.example.demo;

public class Check_Leap_Year {
	public boolean checkleapYear(int year) {
		boolean flag=true;
		if(year%400==0) {
		 flag=true;
		}
		return flag;
	}
}
