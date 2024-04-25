package org.guanzon.cas.validators.client.standard;

import org.guanzon.cas.validators.client.*;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.Model_Client_Master;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Client_Master_Standard implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Master poEntity;
    
    public Validator_Client_Master_Standard(Object foValue){
        poEntity = (Model_Client_Master) foValue;
    }
    
    @Override
    public void setGRider(GRider foValue) {
//        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getLastName().isEmpty()){
            psMessage = "Client last name is not set.";
            return false;
        }
        
        if (poEntity.getFirstName().isEmpty()){
            psMessage = "Client first name is not set.";
            return false;
        }
        
        if (poEntity.getFullName().isEmpty()){
            psMessage = "Client full name is not set.";
            return false;
        }
        
        if (poEntity.getBirthDate() == null){
            psMessage = "Client birth date is not set.";
            return false;
        }
        
        return true;
    }

    @Override
    public String getMessage() {
        return psMessage;
    }
}
