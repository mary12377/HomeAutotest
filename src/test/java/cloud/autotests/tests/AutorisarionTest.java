package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.Autorisation;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class AutorisarionTest  {

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("личный кабинет")
    void registrationTest() {
        Autorisation auth = new Autorisation();

        step("", () ->
                open(Project.config.webUrl()));
        step("войти в личный кабинет", auth::clickSearch);
        step("проверяем что появилось имя личного кабинета", auth::clickName);
    }
}
