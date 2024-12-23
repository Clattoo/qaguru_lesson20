package tests.android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.android.ErrorScreen;
import screens.android.SearchScreen;
import screens.android.components.SearchInputComponent;
import tests.TestBase;


public class AndroidSearchTest extends TestBase {

    SearchInputComponent searchInputComponent = new SearchInputComponent();
    SearchScreen searchScreen = new SearchScreen();
    ErrorScreen errorScreen = new ErrorScreen();

    @Test
    @Tag("android")
    @DisplayName("Проверка механизма поиска Wikipedia")
    void successfulSearchTest() {

        searchInputComponent.clickSearchField()
                        .typeTextSearchField("Al Pacino");
        searchScreen.checkSearchResults();
    }

    @Test
    @Tag("android")
    @DisplayName("Проверка появления ошибки открытия статьи после успешного поискового запроса")
    void openArticleAfterSuccessfulSearchTest() {

        searchInputComponent.clickSearchField()
                .typeTextSearchField("Al Pachino");
        searchScreen.checkSearchResults()
                .openArticle();
        errorScreen.checkError("An error occurred");

    }
}