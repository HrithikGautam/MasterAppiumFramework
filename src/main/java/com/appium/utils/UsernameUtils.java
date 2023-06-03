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

package com.appium.utils;

public class UsernameUtils {

	private UsernameUtils() {
	}

	public static String getUserName() {
		return System.getProperty("user.name");
	}

}
