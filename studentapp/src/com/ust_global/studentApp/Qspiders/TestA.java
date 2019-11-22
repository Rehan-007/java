package com.ust_global.studentApp.Qspiders;

import com.ust_global.studentApp.jspiders.Angular;
import com.ust_global.studentApp.jspiders.React;

public class TestA {
   public static void main(String[] args) {
	
	   Qtp q=new Qtp();
	   q.teachQtp();
	   
	   Selenium se=new Selenium();
	   se.teachSelenium();
	   
	   
	   Angular a=new Angular();
	   a.teachAngular();
	   
	   React r=new React();
	   r.teachReact();
}
}