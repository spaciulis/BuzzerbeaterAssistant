package com.buzzerbeater.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class Overview extends Page{
	
	public String url;

	public Overview(WebDriver driver) {
		super(driver);
		url = Page.baseUrl + "/manage/overview.aspx";
	}

	public Player getPlayerPageByID(String playerID) {
		driver.get(Page.baseUrl + "/player/" + playerID + "/overview.aspx");
		return PageFactory.initElements(driver, Player.class);
	}

	public Staff getStaffPageByID(String staffID) {
		// http://www.buzzerbeater.com/manage/staffBox.aspx?staffID=4201525
		driver.get(Page.baseUrl + "/manage/staffBox.aspx?staffID=" + staffID);
		return PageFactory.initElements(driver, Staff.class);
	}

}
