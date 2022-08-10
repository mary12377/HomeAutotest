package cloud.autotests.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainSerial {
    public static void serial() {
        step("Выбор сериала по категориям ", () -> {
            open("https://lord-s047.lordfilm0.org/");
            $(".sect-title").click();
            $(".chosen-choices").click();
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[1]/div/div/ul/li[3]")).click();
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/ul")).click();//выбираем жанр
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/div/ul/li[2]")).click();//выбираем страну
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[3]/div[1]/label[2]/span")).click();//выбираем иконку сериалы
            $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[4]/input[2]")).click();//очищаем все параметры
        });
        step("проверяем что есть строка с текстом выберите жанр", () -> {
            $(".chosen-search-input.default").shouldBe(visible);
        });
    }

}
