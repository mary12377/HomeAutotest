package cloud.autotests.tests;

import cloud.autotests.helpers.Attach;
import cloud.autotests.helpers.DriverSettings;
import cloud.autotests.pages.Autorisation;
import cloud.autotests.pages.MainMenu;
import cloud.autotests.pages.MainSerial;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class TestBase {
    Autorisation cabinetPage = new Autorisation();
    MainSerial searchPage = new MainSerial();
    MainMenu mainPage = new MainMenu();
    MovieTests helpPage = new MovieTests();

    @BeforeAll
    static void beforeAll() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        DriverSettings.configure();
    }

    @BeforeEach
    void openLabirint() {
        step("open labirint", () -> {
            open("https://www.labirint.ru/");
        });
    }


    @AfterEach
    public void afterEach() {
        Attach.takeScreenshot("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
