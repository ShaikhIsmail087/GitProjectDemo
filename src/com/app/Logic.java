package com.app;

public class Logic {

	public static void main(String[] args) {
		String hungry="yes";
		if(hungry=="Yes" ||hungry=="yes" || hungry=="y" || hungry=="Y")
			System.out.println("eat somthing...");
		else
			System.out.println("do work...");
		for(int i=1;i<11;i++)
			System.out.println("do work..."+i);
	}

}
