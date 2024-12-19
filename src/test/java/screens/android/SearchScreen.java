package screens.android;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {

    @Step("Проверить наличие результатов поиска")
    public SearchScreen checkSearchResults() {
        $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                .shouldHave(sizeGreaterThan(0));

        return this;
    }

    @Step("Проверить наличие результатов поиска")
    public SearchScreen openArticle() {

        $$(id("org.wikipedia.alpha:id/search_results_list")).first().click();

        return this;
    }
}
