package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.MenuSite;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class MenuSiteTest extends TestBase {
    MenuSite menuSite = new MenuSite();

    @Test
    @DisplayName("Меню сайта")
    void menuTest() {

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
}