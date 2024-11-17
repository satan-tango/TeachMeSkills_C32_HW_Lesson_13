package com.varkovich.lesson_13.validator;

import com.varkovich.lesson_13.constants.Constants;
import com.varkovich.lesson_13.exception.WrongLoginException;
import com.varkovich.lesson_13.exception.WrongPasswordException;

public class CredentialValidator {

    public static boolean isCredentialValidFirstOption(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login == null || login.equals("")) {
            throw new WrongLoginException("Fill login field");
        }

        if (password == null || password.equals("")) {
            throw new WrongPasswordException("Fill password field");
        }

        if (confirmPassword == null || confirmPassword.equals("")) {
            throw new WrongPasswordException("Fill confirm password field");
        }

        if (login.length() > 20) {
            throw new WrongLoginException("Invalid login, it must be less then 20 characters");
        }

        if (login.contains(" ")) {
            throw new WrongLoginException("Invalid login, it must not contain 'space'");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Invalid password, it must be less then 20 characters");
        }

        if (password.contains(" ")) {
            throw new WrongPasswordException("Invalid password, it must not contain 'space'");
        }

        if (!password.matches(Constants.REG_EX_CONTAINS_NUMBER)) {
            throw new WrongPasswordException("Invalid password, it must contain at least one number");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password, it must match confirm password");
        }

        return true;
    }

    public static boolean isCredentialValidSecondOption(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        char[] loginCharArray = login.toCharArray();
        char[] passwordCharArray = password.toCharArray();
        char[] confirmPasswordCharArray = confirmPassword.toCharArray();

        if (login == null || login.equals("")) {
            throw new WrongLoginException("Fill login field");
        }

        if (password == null || password.equals("")) {
            throw new WrongPasswordException("Fill password field");
        }

        if (confirmPassword == null || confirmPassword.equals("")) {
            throw new WrongPasswordException("Fill confirm password field");
        }

        if (login.length() > 20) {
            throw new WrongLoginException("Invalid login, it must be less then 20 characters");
        }

        if (isCharArrayContains(loginCharArray, ' ')) {
            throw new WrongLoginException("Invalid login, it must not contain 'space'");
        }

        if (password == null || password.equals("")) {
            throw new WrongPasswordException("Fill password field");
        }

        if (password.length() > 20) {
            throw new WrongPasswordException("Invalid password, it must be less then 20 characters");
        }

        if (isCharArrayContains(passwordCharArray, ' ')) {
            throw new WrongPasswordException("Invalid password, it must not contain 'space'");
        }

        if (!isCharArrayContainsNumber(passwordCharArray)) {
            throw new WrongPasswordException("Invalid password, it must contain at least one number");
        }

        if (passwordCharArray.length != confirmPasswordCharArray.length && (!isCharArraysMatch(passwordCharArray, confirmPasswordCharArray))) {
            throw new WrongPasswordException("Invalid password, it must match confirm password");
        }

        return true;
    }

    private static boolean isCharArrayContains(char[] charArray, char character) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == character) {
                return true;
            }
        }

        return false;
    }

    private static boolean isCharArraysMatch(char[] charArray, char[] charArrayToMatch) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArrayToMatch[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isCharArrayContainsNumber(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isDigit(charArray[i])) {
                return true;
            }
        }

        return false;
    }
}
