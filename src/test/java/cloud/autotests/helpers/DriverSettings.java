package cloud.autotests.helpers;

import cloud.autotests.config.Project;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverSettings {

    public static void configure() {
        Configuration.baseUrl = "https://lord-s047.lordfilm0.org/";
        Configuration.browserSize = System.getProperty("size", "1920x1080");
        Configuration.browser = System.getProperty("browser", "chrome");
        Configuration.pageLoadTimeout = 80000;

        if (Project.isRemoteWebDriver()) {
            String login = Project.config.login();
            String password = Project.config.password();
            String remote = Project.config.remote();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
            Configuration.remote = "https://" + login + ":" + password + "@" + remote;
        }
    }


}
