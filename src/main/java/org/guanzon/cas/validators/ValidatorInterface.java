package org.guanzon.cas.validators;

import org.guanzon.appdriver.base.GRider;


public interface ValidatorInterface {
    public void setGRider(GRider foValue);
    public boolean isEntryOkay();
    public String getMessage();
}
