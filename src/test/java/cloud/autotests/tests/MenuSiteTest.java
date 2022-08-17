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
    @DisplayName("меню сайта")
    void menuTest() {

        step("Oткрывам сайт LORDFILM", () -> {
            open(Project.config.baseUrl());});
        step("// меню сайта", () -> menuSite.clickmenu());
        step("проверяем что в меню есть названия клавиш", () -> menuSite.clickChekmenu());
    }

}


