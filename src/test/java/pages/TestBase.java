package pages;

import applogic.ApplicationManager;
import applogic1.ApplicationManager1;

import model.GetCodeModel;
import model.LoginModel;

import org.apache.tools.ant.types.resources.comparators.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;


/**
 * Created by timrusso on 4/28/16.
 */
public class TestBase {

    protected ApplicationManager app;
    public static LoginModel ADVISER = new LoginModel().setCountryCode("373").setPhone("60097171");
    public static GetCodeModel CODE = new GetCodeModel().setCode("1111");

    @BeforeClass
    public  void setUp() throws Exception {
        app = new ApplicationManager1();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

    @AfterMethod
    public void onTestFailure(ITestResult result) {
        if(!result.isSuccess()) {
            byte[] srcFile =  ((TakesScreenshot) app.getAndroidDriver()).getScreenshotAs(OutputType.BYTES);
            saveScreenshot(srcFile);
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenshot){
        return screenshot;
    }









}
