
import com.codeborne.selenide.Configuration;

import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }
    String state = "NCR";
    String city = "Delhi";


    @Test
    void fillPracticeFormTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        open("/automation-practice-form");
        $("#firstName").setValue("Kate");
        $("#lastName").setValue("Mar");
        $("#userEmail").setValue("kate@kate.ru");
        $("#genterWrapper").find(".custom-control-label").click();
        $("#userNumber").setValue("89333333333");
        $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "A");
        $("#dateOfBirthInput").sendKeys("03.03.1992");
        $("#dateOfBirthInput").pressEnter();
        $("#subjectsInput").setValue("History").pressEnter();
        $("#currentAddress").setValue("test");
        $("#hobbiesWrapper").find("[for=hobbies-checkbox-1]").click();
        $("#uploadPicture").uploadFromClasspath("test.jpg");
        $("#state").click();
        $("#stateCity-wrapper").$(Selectors.byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(Selectors.byText(city)).click();
        $("#submit").click();

        $(".modal-content").shouldHave(text("Kate Mar"));
        $(".modal-content").shouldHave(text("kate@kate.ru"));
        $(".modal-content").shouldHave(text("Male"));
        $(".modal-content").shouldHave(text("89333333333"));
        $(".modal-content").shouldHave(text("03 Mar 1992"));
        $(".modal-content").shouldHave(text("History"));
        $(".modal-content").shouldHave(text("Sports"));
        $(".modal-content").shouldHave(text("test.jpg"));
        $(".modal-content").shouldHave(text("test"));
        $(".modal-content").shouldHave(text(state + " " + city));


    }
}


