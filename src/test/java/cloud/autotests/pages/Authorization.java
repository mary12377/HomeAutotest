package cloud.autotests.pages;

import cloud.autotests.config.Project;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class Authorization {
    private final SelenideElement
            accountField = $(".btn-login.btn.js-login.to-mob"),
            passwordInput = $("#login_password"),
            loginInput = $("#login_name"),
            authInput = $(".login-btn"),
            nameAccount = $(".login-title.nowrap");

    public void accountAuthorization() {
        accountField.click();
        loginInput.setValue(Project.config.login());
        passwordInput.setValue(Project.config.password());
        authInput.click();
    }

    public void authorizationTest(String name) {
        accountField.click();
        nameAccount.shouldHave(text(name));
    }
}


