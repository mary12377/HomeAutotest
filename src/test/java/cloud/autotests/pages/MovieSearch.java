package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MovieSearch {
    private final SelenideElement
            textMovie = $("#story"),

    autTextPage = $(By.xpath("//*[@id=\"dle-content\"]/div[2]")),
            nameTextPage = $(".fleft-desc.fx-1");

    public void clickTextMovie() {
        textMovie.setValue("мы все мертвы").pressEnter();
        autTextPage.click();
    }

    public void chekTextMovie() {
        nameTextPage.shouldHave(text("Мы все мертвы "));
    }
}