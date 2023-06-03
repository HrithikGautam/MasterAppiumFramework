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

package com.appium.manager;

public final class DateTimeManager {

	private DateTimeManager() {
	}

	private static ThreadLocal<String> dateTime = new ThreadLocal<String>();

	public static String getDateTime() {
		return dateTime.get();
	}

	public static void setDateTime(String dateTime2) {
		dateTime.set(dateTime2);
	}

	public static void unload() {
		dateTime.remove();
	}

}
