package cloud.autotests.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainMenu {
    public static void menu() {
    step("// меню сайта", () -> {
        open("https://lord-s047.lordfilm0.org/");
        $(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")).click();
        $(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a")).click();
        $(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a")).click();
        $(By.xpath("//*[@id=\"header\"]/div/ul/li[4]/a")).click();
    });
        step("проверяем что появилось имя личного кабинета", () -> {
            $(".btn-login.btn.js-login.to-mob").shouldBe(visible);
        });
}}
