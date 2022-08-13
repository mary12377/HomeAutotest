package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.MovieSearch;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class MovieTests extends TestBase {


    MovieSearch movieSearch = new MovieSearch();

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("найти фильм в поисковой строке")
    void movieTest() {
        step("", () ->
                open(Project.config.BASE_URL()));
        step("найти фильм в поисковой строке", () -> {
            movieSearch.clickTextMovie();

        });

        step("проверяем что название фильма совпадает с поиском", () ->

        {
            movieSearch.cheсkTextMovie();
        });

    }
}