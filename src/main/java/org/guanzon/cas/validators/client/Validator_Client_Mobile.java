package org.guanzon.cas.validators.client;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.Model_Client_Master;
import org.guanzon.cas.model.clients.Model_Client_Mobile;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Client_Mobile implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Mobile poEntity;
    
    public Validator_Client_Mobile(Object foValue){
        poEntity = (Model_Client_Mobile) foValue;
    }
    
    @Override
    public void setGRider(GRider foValue) {
//        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
        if (poEntity.getMobileID().isEmpty()){
            psMessage = "Mobile ID is not set.";
            return false;
        }
        
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getContactNo().isEmpty()){
            psMessage = "Contact number is not set.";
            return false;
        }
        
        return true;
    }

    @Override
    public String getMessage() {
        return psMessage;
    }
}
