/**
 * *@author Hrithik Gautam
 * https://www.linkedin.com/in/hrithikgautam81/
 * https://github.com/HrithikGautam
 * 
 *
 * Course: Appium Mobile Automation - Android & iOS + Frameworks + CICD (https://www.udemy.com/course/the-complete-appium-course-for-ios-and-android/)
 * Tutor: Omprakash Chavan (https://www.udemy.com/user/omprakash-chavan/)
 */

/***************************************************/

package com.appium.java_Mail_API;

import static com.appium.constants.FrameworkConstants.Project_Name;

/**
 * Data for Sending EMail after execution
 */
public class EmailConfig {

	public static final String SERVER = "smtp.gmail.com";
	public static final String PORT = "587";

	public static final String FROM = "testtmail95@gmail.com";
	public static final String PASSWORD = "********";

	/* "**********@gmail.com", */
	public static final String[] TO = { "testtmail95@gmail.com" };
	public static final String SUBJECT = Project_Name;
}
