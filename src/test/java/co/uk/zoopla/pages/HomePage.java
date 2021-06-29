package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage

{
    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement acceptCookieButton;

    @FindBy(id = "header-location")
    private WebElement location;

    @FindBy (css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement bedDrop;

    @FindBy(css = ".css-w266us-StyledSuggestionButton.eubx8ma5")
    private List<WebElement> autoComplete;

    @FindBy(id = "beds_min")
    private WebElement minimumBed;

    @FindBy(id = "beds_max")
    private WebElement maximumBed;

    @FindBy(css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement priceDrop;

    @FindBy(id = "price_min")
    private WebElement miniPrice;

    @FindBy(id = "price_max")
    private WebElement maxPrice;

    @FindBy(css = "button[title='Show all']")
    private WebElement propertyTypeDrop;


    @FindBy(css = "label[data-testid='radio-button-label']")
    private List<WebElement> houSES;

    @FindBy(css = ".css-1s5vaqk-Button-UpdateButton-StyledButton.ebz205c11")
    private WebElement searchButton;






    public void acceptCookiePolicy()
    {
        acceptCookieButton.click();
    }

    public void enterLocation(String loc)
    {
        location.sendKeys(loc);
    }

    public void dropBedSelector()
    {
        bedDrop.click();
    }

    public void clickFirstOption()
    {
        autoComplete.get(0).click();
    }

    public void selectMinBed(String minBed)
    {
        selectByText(minimumBed,minBed);
    }

    public void selectMaxBed(String maxBed)
    {
        selectByText(maximumBed,maxBed);
    }

    public void dropPriceSelector()
    {
        priceDrop.click();
    }

    public void selectMinPrice(String minPrice)
    {

        selectByText(miniPrice, minPrice);
    }

    public void selectMaxPrice(String maxiPrice)
    {
        selectByText(maxPrice,maxiPrice);
    }

    public void propertyTypeSelector()
    {
        propertyTypeDrop.click();
    }

    public void checkPropertyTypes(String propTypes) {
       // Thread.sleep(3);

        for(WebElement element:houSES){
            if(element.getText().contains(propTypes))
            {
                element.click();
                break;

            }



        }
    }

    public void clickOnSearchButton()
    {
        searchButton.click();
    }
}
