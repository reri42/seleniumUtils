package eu.riswick.tests;

import eu.riswick.seleniumUtils.ExpectedWebElementCondition;
import eu.riswick.seleniumUtils.ExpectedWebElementConditions;
import eu.riswick.seleniumUtils.WebElementWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

/**
 * Created by remco on 1-11-16.
 */
public class SeleniumHelper {

    public WebElement waitUntilPresent(WebElement contextElement, By locator){
        WebElementWait wait = new WebElementWait(contextElement, 2);

        WebElement toFind = wait.until(ExpectedWebElementConditions.presenceOfElementLocated(locator));

        return toFind;
    }
}
