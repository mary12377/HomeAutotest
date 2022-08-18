package cloud.autotests.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class MenuSite {

    // CSS локатор не удалось подобрать
    private final SelenideElement

            movieIkon = $(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")),
            serialIkon = $(By.xpath("//*[@id=\"header\"]/div/ul/li[2]/a")),
            multIkon = $(By.xpath("//*[@id=\"header\"]/div/ul/li[3]/a")),
            animeIkon = $(By.xpath("//*[@id=\"header\"]/div/ul/li[4]/a")),
            resultIcon = $(".header-in.wrap-center.fx-row.fx-middle");

    public void movieIconClick() {
        movieIkon.click();
    }
    public void serialIconClick() {
        serialIkon.click();
    }
    public void setMultiIconClick() {
        multIkon.click();
    }

    public void setAnimeIconClick() {
        animeIkon.click();
    }

    public void checkingMenuIcons(String movie, String serial, String mult) {
        resultIcon.shouldHave(text(movie), text(serial), text(mult));

    }
}
