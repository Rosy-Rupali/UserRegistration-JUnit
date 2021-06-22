/**************************************************
* Purpose : Throwing custom exceptions in case of Invalid user details
* @author : Rosy Rupali
* @since  : 21-06-2021
* @version : 1.0
 *************************************************/
package com.bridgelabz.userregistration_junit;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	/**
	 * UC-1 This method is validating the first name of the user is correct or not.
	 * 
	 * @param firstName
	 * @return true if the pattern matches otherwise it throws validation exception:
	 * @throws ValidationException
	 */
	public boolean validateFirstName(String firstName) throws ValidationException {
		String regex = "^[A-Z][a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		if (firstName == null) {
			return false;
		}
		Matcher m = p.matcher(firstName);
		boolean b = m.matches();
		if (b) {
			return true;
		} else {
			throw new ValidationException("Please enter valid name");
		}
	}

	/**
	 * UC-2 This method is validating the last name of the user is correct or not.
	 * 
	 * @param lastName
	 * @return true if the pattern matches otherwise it throws validation exception:
	 * @throws ValidationException
	 */
	public boolean validateLastName(String lastName) throws ValidationException {
		String regex = "^[A-Z][a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		if (lastName == null) {
			return false;
		}
		Matcher m = p.matcher(lastName);
		boolean b = m.matches();
		if (b) {
			return true;
		} else {
			throw new ValidationException("Please enter valid name");
		}
	}

	/**
	 * UC-3 This method is validating the email id of the user is correct or not.
	 * 
	 * @param emailId
	 * @return true if the pattern matches otherwise it throws validation exception.
	 * @throws ValidationException
	 */
	public boolean validateEmail(String emailId) throws ValidationException {
		String regex = "^[a-z0-9.+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(emailId);
		if (emailId == null) {
			return false;
		}
		boolean b = m.matches();
		if (b) {
			return true;
		} else {
			throw new ValidationException("Please enter valid email Id");
		}

	}

	/**
	 * UC-4 This method is validating the Mobile number of the user is correct or
	 * not.
	 * 
	 * @param mobileNumber
	 * @return true if the pattern matches otherwise it throws validation exception.
	 * @throws ValidationException
	 */
	public boolean validateMobileNo(String mobileNumber) throws ValidationException {
		String regex = "[0-9]{2}\\s{1}[0-9]{10}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNumber);
		if (mobileNumber == null) {
			return false;
		}
		boolean b = m.matches();
		if (b) {
			return true;
		} else {
			throw new ValidationException("Please enter valid phone number");
		}

	}

	/**
	 * UC-5 This method is validating the first rule of password of the user is
	 * correct or not. It should minimum of 8 characters.
	 * 
	 * UC-6 This method is validating the second rule of password of the user is
	 * correct or not. It should contain at least one upper case.
	 * 
	 * UC-7 This method is validating the third rule of password of the user is
	 * correct or not. It should contain at least one numeric value.
	 * 
	 * UC-8 This method is validating the third rule of password of the user is
	 * correct or not. It should contain one special character.
	 * 
	 * @param password
	 * @return true if the pattern matches otherwise it throws validation exception.
	 * @throws ValidationException
	 */
	public boolean validatePassword(String password) throws ValidationException {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		if (password == null) {
			return false;
		}
		boolean b = m.matches();
		if (b) {
			return true;
		} else {
			throw new ValidationException("Please enter valid password");
		}

	}

	public static void main(String[] args) throws ValidationException {
		UserRegistration user = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First Name: ");
		String firstName = scanner.nextLine();
		user.validateFirstName(firstName);

		System.out.println("Enter the Last Name: ");
		String lastName = scanner.nextLine();
		user.validateLastName(lastName);

		System.out.println("Enter the Email Id: ");
		String emailId = scanner.nextLine();
		user.validateEmail(emailId);

		System.out.println("Enter the Mobile Number: ");
		String mobileNumber = scanner.nextLine();
		user.validateMobileNo(mobileNumber);

		System.out.println("Enter the password: ");
		String password = scanner.nextLine();
		user.validatePassword(password);
		scanner.close();
	}

}
