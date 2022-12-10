package com.Utilslayer;

import com.Baselayer.Baseclass;

public class Alertpopup extends Baseclass {

	public Alertpopup() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void accept() {
		driver.switchTo().alert().accept();
	}

	public static void dismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void sendkeys(String value) {
		driver.switchTo().alert().sendKeys(value);
	}

	public static String getText() {
		return driver.switchTo().alert().getText();
	}

}
