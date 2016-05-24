package pages;

import applogic.ApplicationManager;
import applogic1.ApplicationManager1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;


/**
 * Created by timrusso on 4/28/16.
 */
public class TestBase {

    protected ApplicationManager app;

    @BeforeClass
    public  void setUp() throws Exception {
        app = new ApplicationManager1();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
