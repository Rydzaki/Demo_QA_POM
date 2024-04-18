package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage{
    public SidePanel(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alerts;

    public AlertsPage selectAlerts() {
        click(alerts);
        //clickWithJS(alerts, 0, 300);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement browserWindows;

    public BrowserWindowsPage selectBrowserWindows() {
        click(browserWindows);
        return new BrowserWindowsPage(driver);
    }
    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;

    public SelectMenuPage getSelectMenu() {
        clickWithJS(selectMenu, 0, 300); // если разрешение экрана маленькое, то этот костыль применяют для ручной навигации
        return new SelectMenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;

    public PracticeFormPage selectPracticeForm() {
        click(practiceForm);
        return new PracticeFormPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;

    public DroppablePage selectDroppable() {
        click(droppable);
        return new DroppablePage(driver);
    }

    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;

    public BrokenLinksImagesPage selectBrokenLinksImages() {
        click(brokenLinksImages);
        return new BrokenLinksImagesPage(driver);

    }

    @FindBy(xpath = "//span[.='Upload and Download']")
    WebElement download;

    public DownloadPage selectDownload() {
        click(download);
        return new DownloadPage(driver);
    }
}
