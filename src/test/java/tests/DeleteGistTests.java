package tests;

import java.lang.reflect.Method;
import org.testng.annotations.Test;
import utils.ExtentReports.ExtentTestManager;

public class DeleteGistTests extends BaseTest {

    // Extra information:
    // 1) @BeforeClass we declared driver variable.
    // 2) We send driver variable to the page class with below declaration.
    //    Homepage homepage = new HomePage(driver);
    // 3) super () method in page class transfer the driver variable value to the BasePage class.

    @Test(priority = 0, description = "Delete Gist")
	public void deleteGits(Method method) {
		// ExtentReports Description
		ExtentTestManager.startTest(method.getName(), "Delete Gist");

        ghPage
	        .gotoLoginPage()
	        .inputCredential("avif@gmail.com", "pwd")
	        .gotoGitsPage()
	        .verivyPage()
	        .gotoUserpage()
	        .gotoLatestGist()
	        .verivyPage()
	        .deleteGist();

    }
}