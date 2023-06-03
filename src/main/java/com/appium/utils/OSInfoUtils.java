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

public final class OSInfoUtils {

	/**
	 * Private constructor to avoid external instantiation
	 */
	private OSInfoUtils() {
	}

	public static String getOSInfo() {

		return System.getProperty("os.name").replace(" ", "_");

	}

}
