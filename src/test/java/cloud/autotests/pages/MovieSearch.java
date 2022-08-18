package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MovieSearch {
    private final SelenideElement
            textMovie = $("#ajax_search"),

            authText = $(".th-img.img-resp-vert"),
            nameText = $(".fleft-desc.fx-1");

    public void searchMovieTitle() {
        textMovie.setValue("няньки").pressEnter();
        authText.click();
    }

    public void CheckingTheMovieName(String text) {

        nameText.shouldHave(text(text));
    }
}