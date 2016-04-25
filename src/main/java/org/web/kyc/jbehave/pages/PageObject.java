package org.web.kyc.jbehave.pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class PageObject {

    private final WebDriverProvider driverProvider;
    private OwnersPage ownersPage;
    private CommonUtils commonUtil;
    private SubsidiariesPage subsidiariesPage;
    private EntityDetailsPage entityDetailsPage;

    public PageObject(WebDriverProvider driverProvider) {
        this.driverProvider = driverProvider;
    }

    public OwnersPage ownersPage() {
        if (ownersPage == null) {
            ownersPage = new OwnersPage(driverProvider);
        }
        return ownersPage;
    }

    public CommonUtils commonUtils() {
        if (commonUtil == null) {
            commonUtil = new CommonUtils(driverProvider);
        }
        return commonUtil;
    }

    public SubsidiariesPage subsidiariesPage() {
        if (subsidiariesPage == null) {
            subsidiariesPage = new SubsidiariesPage(driverProvider);
        }
        return subsidiariesPage;
    }

    public EntityDetailsPage entityDetailsPage(){
        if(entityDetailsPage == null){
            entityDetailsPage = new EntityDetailsPage(driverProvider);
        }
        return entityDetailsPage;
    }

}