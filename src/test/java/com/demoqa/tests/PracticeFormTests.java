package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class PracticeFormTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountTest(){
        new PracticeFormPage(driver).hideIframes();
        //enter personal data
        //select gender(radio button)
        //enter birthday
        //enter subjects
        //select hobby(check box)
        //select state
        //select city
        //click on submit button
        //assert student form is
        new PracticeFormPage(driver).enterPersonalData("Jo", "Black", "black.jo_test@mail.com", "1234567890")
                .selectGender("Male")
                .enterBirthDay("16 August 1987")
                .enterSubjects(new String[]{"Maths", "Chemistry"})
                .selectHobby(new String[]{"Sports", "Reading"})
                .uploadFile("R:/BM.jpg")
                .selectState("NCR")
                .selectCity("Delhi")
                .clickOnSubmit()
                .verifySuccessTitle("Thanks for submitting the form");
    }

}
