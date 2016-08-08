package applogic1;

import applogic.BrandHelper;

/**
 * Created by timrusso on 6/27/16.
 */
public class BrandHelper1 extends DriverBasedHelper implements BrandHelper {

    private ApplicationManager1 manager;

    public BrandHelper1(ApplicationManager1 manager) {
        super(manager.getAndroidDriver());
        this.manager = manager;
    }

    public void selectBrand1() {
        pages.brandPage.ensurePageLoaded();
        pages.brandPage.selectBrand1();
    }

    public void selectBrand2() {
        pages.brandPage.ensurePageLoaded();
        pages.brandPage.selectBrand2();
    }
    

}
