package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.MovieSearch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class MovieSearchTests extends TestBase {

    MovieSearch movieSearch = new MovieSearch();

    @Test
    @DisplayName("Ищем фильм в поисковой строке")
    void movieTest() {

        step("Oткрываем сайт LORDFILM", () -> {
            open(Project.config.baseUrl());
            step("Вводим название фильма и нажимаем Enter", () -> {
                movieSearch.searchMovieTitle();
            });
            step("Проверяем что название фильма соответствует поиску", () ->
                    movieSearch.CheckingTheMovieName("Няньки"));
        });
    }
}