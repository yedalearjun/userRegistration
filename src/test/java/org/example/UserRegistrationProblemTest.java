package org.example;

import org.junit.Test;

public class UserRegistrationProblemTest {
    UserRegistrationProblem userRegistrationProblem=new UserRegistrationProblem();
    @Test
    public void validateFirstNameTestForPositive() {
        boolean name = false;
        try {
            name = userRegistrationProblem.firstNameValidation("Kuldeep");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void validateLastNameTestForPositive() {
        boolean lastName = false;
        try {
            lastName = userRegistrationProblem.lastNameValidation("Yedale");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void emailTest() {
        boolean email = false;
        try {
            email = userRegistrationProblem.emailValidation("abc-100@yahoo.com");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validateMobilePositive() {
        boolean phone = false;
        try {
            phone = userRegistrationProblem.phoneNumber("+91-9967891679");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validatePassword() {
        boolean pass = false;
        try {
            pass = userRegistrationProblem.passwordValidation("Arjun@123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void validatePassword1() {
        boolean pass2 = false;
        try {
            pass2 = userRegistrationProblem.passwordValidation("Kuldeep@947");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
