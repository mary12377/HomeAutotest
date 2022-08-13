package cloud.autotests.pages;

import cloud.autotests.config.Project;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Autorisation {
    private final SelenideElement mainPageSearchField = $(".btn-login.btn.js-login.to-mob"),
                                  passwordPage = $("#login_password"),
                                  loginPage = $("#login_name"),
                                  autPage = $(".login-btn"),
                                  namePage=$(".login-title.nowrap");

    public void clickSearch() {
        mainPageSearchField.click();
        loginPage.setValue(Project.config.login());
        passwordPage.setValue(Project.config.password());
        autPage.click();
    }
    public void clickName() {
        mainPageSearchField.click();
        namePage.shouldHave(text("marymary"));
    }

}


