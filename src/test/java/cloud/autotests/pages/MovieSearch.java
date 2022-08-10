package cloud.autotests.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MovieSearch {
    public static void movie() {

        step("найти фильм в поисковой строке", () -> {
            open("https://lord-s047.lordfilm0.org/");
            $("#story").setValue("мы все мертвы").pressEnter();
            $(By.xpath("//*[@id=\"dle-content\"]/div[2]")).click();
        });
        step("проверяем что название фильма совпадает с поиском", () -> {
            $(".fleft-desc.fx-1").shouldHave(text("Мы все мертвы "));
        });
    }
}
