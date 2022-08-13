package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MainSerial {
    private final SelenideElement
            mainSerialText = $(".sect-title"),
            mainTextSerial = $(".chosen-choices"),

            mainTextMovie = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[1]/div/div/ul/li[3]")),
            mainTextgenre = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/ul")),
            mainCountry = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[1]/div[2]/div/div/ul/li[2]")),
            mainSerialChoice = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[3]/div[1]/label[2]/span")),
            mainClear = $(By.xpath("//*[@id=\"filter-wrap\"]/form/div[4]/input[2]")),
            resultText = $(".sect-title");

    public void clickParameter() {

        mainSerialText.click();
        mainTextSerial.click();
        mainTextMovie.click();
        mainTextgenre.click();
        mainCountry.click();
        mainSerialChoice.click();
        mainClear.click();

    }

    public void checkParameter() {
        resultText.shouldHave(text("фильм"));

    }

}
