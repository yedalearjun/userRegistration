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
}
