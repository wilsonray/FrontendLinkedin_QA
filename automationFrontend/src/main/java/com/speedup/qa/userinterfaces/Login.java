package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static  final Target ENTER_LOGIN_SCREEN = Target
            .the("Select the button to Sign in")
            .located(By.className("nav__button-secondary"));
    public static  final Target USER_NAME = Target
            .the("Enter username")
            .located(By.id("username"));
    public static  final Target USER_PASSWORD = Target
            .the("Enter password")
            .located(By.name("session_password"));
    public static  final Target CLICK_SIGNIN_BUTTON = Target
            .the("Submit Sign in")
            .located(By.cssSelector(".btn__primary--large"));
    public static  final Target VALIDATE_LOGIN = Target
            .the("Check user name to validate login")
            .located(By.cssSelector(".t-16:nth-child(2)"));
}
