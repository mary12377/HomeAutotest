package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.Autorisation;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class AutorisarionTest extends TestBase {
    Autorisation auth = new Autorisation();

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("личный кабинет")
    void registrationTest() {

        step("", () -> open(Project.config.baseUrl()));
        step("войти в личный кабинет", auth::clickSearch);
        step("проверяем что появилось имя личного кабинета", auth::clickName);
    }
}
