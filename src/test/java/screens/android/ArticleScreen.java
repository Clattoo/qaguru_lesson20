package screens.android;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.*;

public class ArticleScreen {

        @Step("Нажать на строку ввода текста в поле поиска")
        public ArticleScreen checkArticleName(String articleTitle) {

            $(className("android.widget.TextView")).shouldHave(Condition.text(articleTitle));

            return this;
        }
}

