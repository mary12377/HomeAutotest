package cloud.autotests.tests;

import cloud.autotests.config.Project;
import cloud.autotests.pages.Authorization;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

@Tag("simple")
public class AuthorizationTest extends TestBase {
    Authorization auth = new Authorization();

    @Test
    @DisplayName("Личный кабинет")
    void personalAccountTest() {

        step("Oткрываем сайт LORDFILM", () -> {
            open(Project.config.baseUrl());
        });
        step("Авторизуемся как пользователь", () -> {
            auth.accountAuthorization();
        });
        step("Проверяем что появился пользователь", () -> {
            auth.authorizationTest("marymary");
        });
    }
}
