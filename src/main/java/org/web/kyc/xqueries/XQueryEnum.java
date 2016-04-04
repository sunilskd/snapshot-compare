package org.web.kyc.xqueries;

public enum XQueryEnum {

    ENTITY_DETAILS("qa-kyc-ubo-getEntityDetails.xqy"),
    DIRECT_OWNERS("qa-kyc-ubo-get-DO-subs-List.xqy"),
    SUBSIDIARIES("qa-kyc-ubo-get-DO-subs-List.xqy");
    private String xQueryName;

    XQueryEnum(String xQueryName) {
        this.xQueryName = xQueryName;
    }

    public String getXQueryName(){
        return xQueryName;
    }
}