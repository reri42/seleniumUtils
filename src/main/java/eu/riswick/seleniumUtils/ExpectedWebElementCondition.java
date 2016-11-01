package eu.riswick.seleniumUtils;

import com.google.common.base.Function;
import org.openqa.selenium.WebElement;

/**
 * Created by remco on 1-11-16.
 */
public interface ExpectedWebElementCondition<T> extends Function<WebElement, T> {}
