package screens.ios;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static org.assertj.core.api.Assertions.assertThat;

public class SampleAppSearchScreen {

    @Step("Нажать в поле для поиска")
    public SampleAppSearchScreen clickSearchField() {

        $(accessibilityId("Text Button")).click();
        return this;
    }

    @Step("Написать запрос в поле поиска")
    public SampleAppSearchScreen searchQuery(String query) {

        $(accessibilityId("Text Input")).sendKeys(query);
        $(accessibilityId("Text Input")).pressEnter();
        return this;
    }

    @Step("Проверить результат выдачи")
    public void checkSearchResult(String expectedText) {

        String actualText = $(accessibilityId("Text Output")).getText();
        assertThat(actualText).contains(expectedText);
    }
}