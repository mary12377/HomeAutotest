package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MovieSearch {
    private final SelenideElement
            textMovie = $("#ajax_search"),

    autTextPage = $(".th-mask.fx-col.fx-center.fx-middle.anim"),
            nameTextPage = $(".fleft-desc.fx-1");

    public void clickTextMovie() {
        textMovie.setValue("мы все мертвы").pressEnter();
        autTextPage.click();
    }

    public void textMovie() {
        nameTextPage.shouldHave(text("Мы все мертвы "));
    }
}