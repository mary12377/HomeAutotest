package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class MenuSite {

    private final SelenideElement
            mainMovie = $(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")),
            mainSerial = $(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a")),
            mainMult = $(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a")),
            mainAnime = $(By.xpath("//*[@id=\"header\"]/div/ul/li[4]/a")),
            resultPage = $(".header-in.wrap-center.fx-row.fx-middle");

    public void clickmenu() {
        mainMovie.click();
        mainSerial.click();
        mainMult.click();
        mainAnime.click();


    }

    public void clickChekmenu() {
        resultPage.shouldHave(text("фильмы"), text("сериалы"), text("мультфильмы"));

    }
}
