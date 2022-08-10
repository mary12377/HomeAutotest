package cloud.autotests.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Autorisation {

    public static void auth(String login,String password) {
        step("", () -> {
            open("https://lord-s047.lordfilm0.org/");
        });
        step("войти в личный кабинет", () -> {
            $(".btn-login.btn.js-login.to-mob").click();
            $("#login_name").setValue(login);
            $("#login_password").setValue(password);
            $(".login-btn").click();

        });
        step("проверяем что появилось имя личного кабинета", () -> {
            $(".btn-login.btn.js-login.to-mob").shouldBe(visible);
        });
    }
}


