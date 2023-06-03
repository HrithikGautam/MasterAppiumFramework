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

import io.appium.java_client.AppiumDriver;

public final class DriverManager {

	private DriverManager() {
	}

	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<AppiumDriver>();

	public static AppiumDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(AppiumDriver driverref) {
		driver.set(driverref);
	}

	public static void unload() {
		driver.remove();
	}

}
