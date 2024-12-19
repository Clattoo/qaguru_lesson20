package screens.android.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchInputComponent {

    @Step("Нажать на строку ввода текста в поле поиска")
    public SearchInputComponent clickSearchField() {

        $(accessibilityId("Search Wikipedia")).click();

        return this;
    }

    @Step("Ввод названия статьи {title} в поле ввода поисковой строки")
    public SearchInputComponent typeTextSearchField(String title) {

        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(title);

        return this;
    }
}
