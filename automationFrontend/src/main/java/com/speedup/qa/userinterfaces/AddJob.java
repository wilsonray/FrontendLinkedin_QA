package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddJob {

    public static  final Target CLICK_ON_ME_BUTTON = Target
            .the("Click on Me button")
            .located(By.xpath("//nav[@class='global-nav__nav']//li//div/button"));
    public static  final Target CLICK_VIEW_PROFILE = Target
            .the("Click on view profile button")
            .located(By.linkText("View Profile"));
    public static  final Target CLICK_ADD_POSITION_BUTTON = Target
            .the("Click add position button")
            .located(By.xpath("//li-icon[@type='plus-icon']"));
    public static  final Target ADD_JOB = Target
            .the("Click add position button")
            .located(By.cssSelector(".pvs-overflow-content__item:nth-child(1) span:nth-child(1)"));
    public static  final Target WRITE_TITLE = Target
            .the("Write the title of the job")
            .located(By.xpath("//input[@placeholder='Ex: Retail Sales Manager']"));
    public static  final Target SELECT_EMPLOYMENT_TYPE = Target
            .the("Select employment type")
            .locatedBy("//select[@id='text-entity-list-form-component-profileEditFormElement-POSITION-profilePosition-ACoAADPa4MIB-qP7Q2QF1V51DZ0tR4mVlng6rDU-1-employmentStatus']//option[@value='{0}']");
    public static  final Target WRITE_COMPANY_NAME = Target
            .the("Write the company name")
            .located(By.xpath("//input[@id='single-typeahead-entity-form-component-profileEditFormElement-POSITION-profilePosition-ACoAADPa4MIB-qP7Q2QF1V51DZ0tR4mVlng6rDU-1-requiredCompany']"));
    public static  final Target WRITE_LOCATION = Target
            .the("Write the location of the job")
            .located(By.xpath("//input[@id='single-typeahead-entity-form-component-profileEditFormElement-POSITION-profilePosition-ACoAADPa4MIB-qP7Q2QF1V51DZ0tR4mVlng6rDU-1-geoPositionLocation']"));
    public static  final Target SELECT_START_MONTH = Target
            .the("Select the start month of the job")
            .locatedBy("//select[@id='date-range-form-component-profileEditFormElement-POSITION-profilePosition-ACoAADPa4MIB-qP7Q2QF1V51DZ0tR4mVlng6rDU-1-dateRange-start-date']//option[@value='{0}']");
    public static  final Target SELECT_START_YEAR = Target
            .the("Select the start year of the job")
            .locatedBy("//select[@id='date-range-form-component-profileEditFormElement-POSITION-profilePosition-ACoAADPa4MIB-qP7Q2QF1V51DZ0tR4mVlng6rDU-1-dateRange-start-date-year-select']//option[@value='{0}']");

}
