package cloud.autotests.pages;

import cloud.autotests.config.Project;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Autorisation {
    private final SelenideElement mainPageSearchField = $(".btn-login.btn.js-login.to-mob"),
                                  passwordPage = $("#login_password"),
                                  loginPage = $("#login_name"),
                                  autPage = $(".login-btn"),
                                  namePage=$(".btn-login.btn.js-login.to-mob");

    public void clickSearch() {
        mainPageSearchField.click();
        loginPage.setValue(Project.config.login());
        passwordPage.setValue(Project.config.password());
        autPage.click();
    }
    public void clickName() {
        namePage.shouldBe(visible);
    }

}


