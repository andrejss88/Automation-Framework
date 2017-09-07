package com.github.tests.homepage;

import com.github.pages.SignUpPage;
import com.github.tests.abstractpagetest.AbstractHomePageTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageSignUp extends AbstractHomePageTest {

    @Test
    public void signUp_fails() {

        home.enterUserName("user")
                .enterEmail("some@email.com")
                .enterPassword("password")
                .clickSignUp();

        SignUpPage signUpPage = SignUpPage.initPageElements(driver);

        // Assert
        Assert.assertTrue(signUpPage.isPageOpened(), "Could not assert Sign Up Page opened");

    }
}
