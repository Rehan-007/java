package com.ust_global.studentApp.Qspiders;

import com.ust_global.studentApp.jspiders.Remote;

public class TestB {
    public static void main(String[] args) {
		  Remote.on();
		  Remote.off();
		  System.out.println(Remote.num);
		  Remote r=new Remote();
		  System.out.println(r.sum);
	}
}