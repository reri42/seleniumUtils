package eu.riswick.seleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by remco on 1-11-16.
 * ExpectedWebElementConditions is similar to ExpectedConditions of selenium only provides methods that work
 * within the context of a WebElement.
 */
public  class ExpectedWebElementConditions {
    private ExpectedWebElementConditions(){}

    public static ExpectedWebElementCondition<WebElement> presenceOfElementLocated(final By locator){
        return new ExpectedWebElementCondition<WebElement>() {
            public WebElement apply(WebElement webElement) {
                return webElement.findElement(locator);
            }

            @Override
            public String toString() {
                return "Presence of element located by " + locator;
            }
        };
    }
}
