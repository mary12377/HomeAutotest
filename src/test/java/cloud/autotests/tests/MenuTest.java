package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.MainMenu;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MenuTest extends TestBase{
    MainMenu mainMenu = new MainMenu();

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("меню сайта")
    void menuTest() {
        step("", () ->
                open(Project.config.webUrl()));
        step("// меню сайта", () -> {
            mainMenu.clickmenu();
        });
        step("проверяем что в меню есть названия клавиш", () -> {
            mainMenu.clickChekmenu();
        });
    }

}

