package pages;

import applogic.ApplicationManager;
import applogic1.ApplicationManager1;

import model.GetCodeModel;
import model.LoginModel;

import org.openqa.selenium.OutputType;
import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.IOException;

import static org.testng.AssertJUnit.assertTrue;


/**
 * Created by timrusso on 4/28/16.
 */
public class TestBase implements IHookable {

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


    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        callBack.runTestMethod(testResult);
        if (testResult.getThrowable() != null) {
            try {
                takeScreenShot(testResult.getMethod().getMethodName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Attachment(value = "Failure in method {0}", type = "image/png")
    private byte[] takeScreenShot(String methodName) throws IOException {
        return app.getAndroidDriver().getScreenshotAs(OutputType.BYTES);
    }


    protected void loginAsAdviser() throws Exception {
        //test on dev server
            LoginModel loginModel = new LoginModel().setPhone("00000");
            app.getLoginHelper().switchToDevServer(loginModel);
        //------------------------------------------------------------

        app.getLoginHelper().loginAs(ADVISER);
        assertTrue(app.getLoginHelper().isGetCodeTrue());
        app.getGetCodeHelper().setCode(CODE);

        if(app.getTeamHelper().loadTeamPage()) {
            app.getTeamHelper().selectTeam1();
        }
    }
}
