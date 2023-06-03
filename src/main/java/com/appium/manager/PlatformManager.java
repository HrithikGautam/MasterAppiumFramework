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

public final class PlatformManager {

	private PlatformManager() {
	}

	private static ThreadLocal<String> platform = new ThreadLocal<String>();

	public static String getPlatform() {
		return platform.get();
	}

	public static void setPlatform(String driverref) {
		platform.set(driverref);
	}

	public static void unload() {
		platform.remove();
	}

}
