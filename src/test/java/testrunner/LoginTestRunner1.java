package testrunner;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class LoginTestRunner1 extends BaseTest {
    @Test
    public void loginTest() throws IOException, ParseException {
        getDriver().get("http://automationpractice.com/");
        Login login = new Login(getDriver());

        //valid email and valid password
        // user = login.doLogin("test_viva@test.com", "123456");
       // Assert.assertEquals(user, "viva test");

    }

}