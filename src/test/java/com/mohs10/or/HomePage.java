package com.mohs10.or;

import org.openqa.selenium.By;

public class HomePage {
	
	
	//OrangeHRM
	public static By company=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a");
	public static By carrier=By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[4]/div/div/div/div/ul/li[5]/a");
	public static By techlead=By.id("vacancy_138");
	public static By apply1=By.xpath("//*[@id=\"vacancy_138\"]/div[2]/div[1]/a");
	public static By resume=By.xpath("//div[@class='btn']");
	public static By lnkattachfile  =By.xpath("//input[@name=\"applicationForm[resume]\"]");
	public static By firstname=By.xpath("//*[@id=\"applicationForm_firstName\"]");
	public static By midlename=By.xpath("//*[@id=\"applicationForm_middleName\"]");
	public static By lastname=By.xpath("//*[@id=\"applicationForm_lastName\"]");
	public static By emailid=By.xpath("//*[@id=\"applicationForm_email\"]");
	public static By contact=By.xpath("//*[@id=\"applicationForm_contactNo\"]");
	public static By apply2=By.xpath("//*[@id=\"applyForJobButton\"]");
}