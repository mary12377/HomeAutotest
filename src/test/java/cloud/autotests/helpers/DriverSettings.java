package cloud.autotests.helpers;

import cloud.autotests.config.Project;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DriverSettings {

    public static void configure() {
        Configuration.browser = Project.config.browser();
        Configuration.browserVersion = Project.config.browserVersion();
        Configuration.browserSize = Project.config.browserSize();
        Configuration.baseUrl = Project.config.webUrl();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        Configuration.browserCapabilities = capabilities;

        if (Project.isRemoteWebDriver()) {
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.remote = Project.config.remoteDriverUrl();
        }
    }


}
