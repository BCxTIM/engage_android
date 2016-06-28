package applogic1;

import applogic.GetCodeHelper;
import model.GetCodeModel;

/**
 * Created by timrusso on 4/28/16.
 */
public class GetCodeHelper1 extends DriverBasedHelper implements GetCodeHelper{

    private ApplicationManager1 manager;

    public GetCodeHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void openContactUsForm() {
        pages.getCodePage.ensurePageLoaded();
        pages.getCodePage.clickContactUsLink();
        pages.contactUsPage.ensurePageLoaded();
    }

    public void setCode(GetCodeModel getCodeModel) {
        pages.getCodePage.ensurePageLoaded();
        pages.getCodePage
                .setCode(getCodeModel.getCode())
                .clickGetStarted();

        //check if adviser has 2 or more brands
        if(pages.brandPage.waitPageLoaded()) {
            pages.brandPage.selectBrand1();
        }
    }


}
