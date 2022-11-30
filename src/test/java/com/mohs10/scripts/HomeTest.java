package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser
	{
		
		//Testing with Valid login inputs 
		@Test(priority = 0)
		 public void LoginPageTestCase() throws Exception {
			CommonFuns hm2 = new CommonFuns();
	
		hm2.logIn("C:\\Users\\pdf\\5g.pdf","Amit","kumar","prasad","amitp8763@gmail.com","82496494561");
	//hm2.logIn("C:\\Users\\pdf\\5g.pdf","Amit","kumar","78aw456 ","amitp8763@yahoo.Com","75846231450");
	//	hm2.logIn("C:\\Users\\pdf","@3#ipl","&6fde","Done","xyz@hotmail.Com","91+02149451262");
		} 
		//C:\Users\pdf
		
		/*	//Testing with inValid login inputs
	@Test(priority = 1)
	public void LoginPageTestCase1() throws Exception {
		CommonFuns hm2 = new CommonFuns();
		hm2.logIn("C:\\Users\\HP\\Desktop\\5g.pdf","Amit","kumar","78aw456 ","amitp8763@yahoo.Com","75846231450");
		}
	
	//Testing with inValid login inputs
			@Test(priority = 2)
			 public void LoginPageTestCase2() throws Exception {
				CommonFuns hm2 = new CommonFuns();
				hm2.logIn("C:\\Users\\HP\\Desktop\\5g.pdf","@3#ipl","&6fde","Done","xyz@hotmail.Com","91+02149451262");
				  }  */
				  		
	}