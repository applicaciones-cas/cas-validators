package org.guanzon.cas.validators.account;

import org.guanzon.cas.validators.client.company.*;
import org.guanzon.cas.validators.client.*;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.models.Model_AP_Client_Ledger;
import org.guanzon.cas.models.Model_Account_Accreditation;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_AP_Client_Ledger implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_AP_Client_Ledger poEntity;
    
    public Validator_AP_Client_Ledger(Object foValue){
        poEntity = (Model_AP_Client_Ledger) foValue;
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
        if (poEntity.getLedgerNo().isEmpty()){
            psMessage = "Ledger No is not set.";
            return false;
        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

