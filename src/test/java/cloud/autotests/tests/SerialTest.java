package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.MainSerial;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class SerialTest extends TestBase {
    MainSerial mainSerial = new MainSerial();

    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("выбор сериала по категориям")
    void serialTest() {
        step("Open main page", () ->
                open(Project.config.BASE_URL()));
        step("выбор сериала по категориям", () -> mainSerial.clickParameter());
        step("проверяем что есть кнопка стекстом фильм", () -> mainSerial.checkParameter());
    }
}
