package com.demoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class SelectMenuPage extends BasePage{
    public SelectMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "oldSelectMenu")
    WebElement oldSelectMenu;
    public SelectMenuPage selectOldStyle(String color) {

        Select select = new Select(oldSelectMenu);
        select.selectByVisibleText(color);

        List<WebElement> options = select.getOptions();
        System.out.println(select.getFirstSelectedOption().getText()+ " is first");
        System.out.println("===========================================");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        return this;
    }



    @FindBy(css = "html")
    WebElement space;
    @FindBy(id = "react-select-4-input")
    WebElement selectInput;
    public SelectMenuPage multiSelect(String[] colors) {
        for (int i = 0; i < colors.length; i++) {
            if(colors[i] != null){
                selectInput.sendKeys(colors[i]);
                selectInput.sendKeys(Keys.ENTER);
            }
        }
        click(space);
        return this;
    }
}
