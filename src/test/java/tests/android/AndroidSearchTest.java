package tests.android;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.android.ErrorScreen;
import screens.android.SearchScreen;
import screens.android.components.SearchInputComponent;
import tests.TestBase;

@Tag("android")
@DisplayName("Проверки для Android")
public class AndroidSearchTest extends TestBase {

    SearchInputComponent searchInputComponent = new SearchInputComponent();
    SearchScreen searchScreen = new SearchScreen();
    ErrorScreen errorScreen = new ErrorScreen();

    @Test
    @DisplayName("Проверка механизма поиска Wikipedia")
    void successfulSearchTest() {

        searchInputComponent.clickSearchField()
                        .typeTextSearchField("Al Pacino");
        searchScreen.checkSearchResults();
    }

    @Test
    @DisplayName("Проверка появления ошибки открытия статьи после успешного поискового запроса")
    void openArticleAfterSuccessfulSearchTest() {

        searchInputComponent.clickSearchField()
                .typeTextSearchField("Al Pacino");
        searchScreen.checkSearchResults()
                .openArticle();
        errorScreen.checkError("An error occurred");

    }
}