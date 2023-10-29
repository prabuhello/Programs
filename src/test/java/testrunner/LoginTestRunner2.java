package testrunner;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.ParseException;

public class LoginTestRunner2 extends BaseTest {

    @Test
    public void loginWithInvalidEmailTest() throws IOException, ParseException {
        
        getDriver().get("http://automationpractice.com/");
        Login login = new Login(getDriver());

        //invalid email and valid pass
     //   String lblInvalidEmail = login.loginWithInvalidPassword("viva@te.com", "123456");
      //  Assert.assertEquals(lblInvalidEmail, "Authentication failed.");
    }
}