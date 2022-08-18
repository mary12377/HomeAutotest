package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainSerial {
    private final SelenideElement

            mainSerialText = $(".sect-title"),
            mainTextSerial = $(".chosen-choices"),
            textMovie = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[1]/div/div/ul/li[3]")),
            textGenre = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/ul")),
            textCountry = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/div/ul/li[2]")),
            textSerialChoice = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[3]/div[1]/label[2]/span")),
            parametersClear = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[4]/input[2]")),
            resultText = $(".sect-title");

    public void parameterGenre() {

        mainSerialText.click();
        mainTextSerial.click();
        textMovie.click();
        textGenre.click();

    }

    public void parameterCountry() {
        textCountry.click();
    }

    public void parameterSerial() {
        textSerialChoice.click();
    }

    public void parameterClear() {
        parametersClear.click();
    }


    public void checkParameter(String movie) {
        resultText.shouldHave(text(movie));

    }

}
