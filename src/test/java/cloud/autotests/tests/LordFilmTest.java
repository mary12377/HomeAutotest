package cloud.autotests.tests;

import cloud.autotests.config.Project;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LordFilmTest extends TestBase {

    @Test
    @DisplayName("Личный кабинет")
    void authorizationTest() {

        step("Oткрываем сайт LORDFILM", () -> {
            open(Project.config.baseUrl());
        });
        step("Авторизуемся как пользователь", () -> {
            auth.accountAuthorization();
        });
        step("Проверяем что появился пользователь", () -> {
            auth.userName("marymary");
        });
    }

    @Test
    @DisplayName("Выбираем сериал по параметрам")
    void movieSearchTestWithParameters() {

        step("Oткрываем сайт LORDFILM", () -> {
            open(Project.config.baseUrl());
        });
        step("Выбираем параметр жанр", () -> {
            mainSerial.parameterGenre();
        });
        step("Выбираем параметр страна", () -> {
            mainSerial.parameterCountry();
        });
        step("Выбираем параметр сериал", () -> {
            mainSerial.parameterSerial();
        });
        step("Выбираем параметр очистить", () -> {
            mainSerial.parameterClear();
        });
        step("Проверяем что есть кнопка с параметром фильм", () -> {
            mainSerial.checkParameterName("фильм");
        });

    }

    @Test
    @DisplayName("Меню сайта")
    void checkMenuItemsTest() {

        step("Oткрываeм сайт LORDFILM", () -> {
            open(Project.config.baseUrl());
            step("Нажимаем на иконку фильм", () -> {
                menuSite.movieIconClick();
            });
            step("Нажимаем на иконку сериал", () -> {
                menuSite.serialIconClick();
            });
            step("Нажимаем на иконку мультфильмы", () -> {
                menuSite.setMultiIconClick();
            });
            step("Нажимаем на иконку аниме", () -> {
                menuSite.setAnimeIconClick();
            });

            step("Проверяем что в меню есть названия иконок", () ->
                    menuSite.checkingMenuIcons("фильмы", "сериалы", "мультфильмы"));
        });
    }

    @Test
    @DisplayName("Ищем фильм в поисковой строке")
    void сheckingTheMovieSearchTest() {

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
