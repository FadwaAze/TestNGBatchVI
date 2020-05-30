package com.utils;


import com.pages.AddEmployeePageElements;
import com.pages.DashBoardPageElements;
import com.pages.LoginpageElements;
import com.pages.PersonalDetailsPageElement;


// initialize ALL pages class and stores references in static variables
//that will be called/used in test class
public class PageInitializer extends BaseClass{

	public static LoginpageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElement pDetails;

	public static void initialize() {
		login = new LoginpageElements();
		dashboard = new DashBoardPageElements();
		addEmp = new AddEmployeePageElements();
		pDetails = new PersonalDetailsPageElement();

	}

}
