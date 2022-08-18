package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.MainSerial;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class MainSerialTest extends TestBase {
    MainSerial mainSerial = new MainSerial();

    @Test
    @DisplayName("Выбираем сериал по параметрам")
    void choiceSerial() {

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
}
