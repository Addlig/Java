package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage{



    @FindBy(id = "orb-search-q")
    private WebElement searchField;

    @FindBy(css ="#[data-result-number='1'] [itemprop='headline'] a")
    private WebElement firstTitle;

    @FindBy(id = "orb-search-button")
    private WebElement button;

    public void clickSearch(){
        System.out.println("clicking on sign in button");
        searchField.click();
        System.out.println("click");
    }
    public void clearSearch() {
        searchField.clear();
        System.out.println("clear");
    }
    public void printText(String text){
        searchField.sendKeys(text);
    }
    public void enterText(){
        button.click();
    }
    public String getTextTitle() {
        return firstTitle.getText();
    }

}


/** System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Driver\\geckodriver.exe");
 driver = new FirefoxDriver();**/