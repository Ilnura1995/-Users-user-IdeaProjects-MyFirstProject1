package steps;

import com.talentLMS.Ui.dataProvider.ConfigReader;
import com.talentLMS.Ui.dataProvider.MockDateGenerator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WindowType;

public class AddNewUser extends BaseTest {

    @Given("user on web")
    public void user_on_web() {
        loginPage.login(ConfigReader.getProperty("qaEnv"));
    }

    @Then("user should see home page")
    public void user_should_see_home_page() {
    }

    @Then("user clicked Add user button to create new user")
    public void user_clicked_add_user_button_to_create_new_user() {
        loginPage.goToAddNewUserPage();
    }

    @Then("user should see input fields")
    public void user_should_see_input_fields() {
    }

    @Then("user create new user with mock data using faker")
    public void user_create_new_user_with_mock_data_using_faker()  {
        String parentPage = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://youtu.be/n-jVNxIhY6M?t=40");
        driver.switchTo().window(parentPage);
//        for (int i = 0; i < 10; i++) {
            addNewUserPages.inputFirstName(MockDateGenerator.generateMockFirstName())
                    .inputLastName(MockDateGenerator.generateMockLastName())
                    .inputPassword(MockDateGenerator.generateMockPassword())
                    .inputLogin(MockDateGenerator.generateMockUserName())
                    .inputEmailAddress(MockDateGenerator.generateMockEmail())
                    .inputBio(MockDateGenerator.generateMockBio());
        driver.navigate().back();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Then("user loop {int} time")
    public void userLoopTime(Integer loop) {
        for(int i = 0;i < loop;i++){
            user_on_web();
            user_clicked_add_user_button_to_create_new_user();
            user_should_see_input_fields();
        }
    }
}

