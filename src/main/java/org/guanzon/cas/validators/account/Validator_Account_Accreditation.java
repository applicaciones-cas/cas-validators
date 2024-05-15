package org.guanzon.cas.validators.account;

import org.guanzon.cas.validators.client.company.*;
import org.guanzon.cas.validators.client.*;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.models.Model_Account_Accreditation;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Account_Accreditation implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Account_Accreditation poEntity;
    
    public Validator_Account_Accreditation(Object foValue){
        poEntity = (Model_Account_Accreditation) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }
    @Override
    public boolean isEntryOkay() {
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        if (poEntity.getAcctType().isEmpty()){
            psMessage = "Barangay is not set.";
            return false;
        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}
