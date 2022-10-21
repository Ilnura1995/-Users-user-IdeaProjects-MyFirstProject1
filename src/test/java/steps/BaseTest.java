package steps;

import com.talentLMS.Ui.helpers.Helper;
import com.talentLMS.Ui.pages.AddNewUserPages;
import com.talentLMS.Ui.pages.AdminHomePages;
import com.talentLMS.Ui.pages.BasePage;
import com.talentLMS.Ui.pages.LoginPage;

public abstract class BaseTest extends BasePage {


   protected LoginPage loginPage = new LoginPage();
   protected Helper helper = new Helper();
   protected AdminHomePages adminHomePages = new AdminHomePages();
   protected AddNewUserPages addNewUserPages = new AddNewUserPages();
}
