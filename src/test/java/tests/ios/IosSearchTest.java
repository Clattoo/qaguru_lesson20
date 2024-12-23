package tests.ios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.ios.SampleAppMainScreen;
import screens.ios.SampleAppSearchScreen;
import tests.TestBase;

@Tag("ios")
@DisplayName("Проверки для iOS")
public class IosSearchTest extends TestBase {

    @Test
    @DisplayName("Проверить, что 'поиск' работает")
    public void successfulSearchTest() {

        String query = "Appium";
        SampleAppSearchScreen searchScreen = new SampleAppSearchScreen();

        searchScreen
                .clickSearchField()
                .searchQuery(query);

        searchScreen
                .checkSearchResult(query);
    }

    @Test
    @DisplayName("Проверить, что поиск статей работает")
    public void successfulCheckExistTextTest() {

        SampleAppMainScreen mainScreen = new SampleAppMainScreen();

        mainScreen
                .checkExistText("Text")
                .checkExistText("Alert");
    }
}