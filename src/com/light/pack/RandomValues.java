package com.light.pack;

import java.util.Calendar;
import java.util.Random;

/**
 * @author Volkov Alexander [alexandrvolkov3@gmail.com], - 'light'
 * @version 0.1
 *
 */

public class RandomValues {

	/**
	 * Methods for random generated some values to input in hidden inputs,
	 * inputs and other
	 **/
	static Random r = new Random(); // r - object of class Random()

	/** Default values for methods **/
	private static String[] monthsNum = { "01", "02", "03", "04", "05", "06",
			"07", "08", "09", "10", "11", "12" }; /* monthsNum - range of numbers of month from 01 to 12 */
													
	private static String[] monthsStr = { "January", "February", "March",
			"April", "May", "June", "July", "August", "September", "October",
			"November", "December" }; /* monthsNum - range of numbers of month from 'January' to 'December' */
										

	private static String[] gender = { "Male", "Female", "Other" }; /* Default values  for gender of user */
																	 

	/** Return random date of birth in range [1 to 30] **/
	public int randomDateofBirth() {

		int dayOfBirthday = r.nextInt((30 - 1) + 1) + 1;

		/** Example how to insert 'dayOfBirthday' to text input **/
		// birthday.setText(Integer.valueOf(dayBirthday).toString());

		return dayOfBirthday;

	} // End of method randomDateofBirth()

	/** Return random month of birth in range [01 to 12] **/
	public String randomMonthOfBirthNum() {

		String checkMonthInTypeNum = monthsNum[r.nextInt(monthsNum.length)];
		return checkMonthInTypeNum;

	} // End of method randomMonth()

	/** Return random month of birth in range ['January' to 'December'] **/
	public String randomMonthOfBirthStr() {

		String checkMonthInTypeStr = monthsStr[r.nextInt(monthsStr.length)];
		return checkMonthInTypeStr;

	} // End of method randomMonth()

	/** Return random year of birthday in range [10 to 60 years] **/
	public int randomYearOfBirth() {

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		int yearOfBirthday = r
				.nextInt(((currentYear - 10) - (currentYear - 60)) + 1)
				+ (currentYear - 60);
		return yearOfBirthday;

	} // End of method randomYearOfBirth()

	/** Return random gender of user **/
	public String randomGender() {

		String randomGender = gender[r.nextInt(gender.length)];
		return randomGender;

	}

	/** Empty methods for working with scenario **/

	public String EmptyRandomMonthOfBirth(String[] monthArray) {

		String checkMonth = monthArray[r.nextInt(monthArray.length)];
		return checkMonth;

	} // End of EmptyRandomMonthOfBirth()

	public String EmptyRandomGenderOfBirth(String[] genderArray) {

		String checkGender = genderArray[r.nextInt(genderArray.length)];
		return checkGender;

	} // End of EmptyRandomMonthOfBirth()

} // End of class RandomValues
