package org.guanzon.cas.validators.client.parameter;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.Model_Client_Address;
import org.guanzon.cas.model.clients.Model_Client_Mail;
import org.guanzon.cas.model.clients.Model_Client_Master;
import org.guanzon.cas.model.clients.Model_Client_Mobile;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Client_Address implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Address poEntity;
    
    public Validator_Client_Address(Object foValue){
        poEntity = (Model_Client_Address) foValue;
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
        if (poEntity.getBarangayID().isEmpty()){
            psMessage = "Barangay is not set.";
            return false;
        }
        
        if (poEntity.getTownID().isEmpty()){
            psMessage = "Town is not set.";
            return false;
        }
                
       
        
        
        return true;
    }
    
    public boolean isStandardEntryOkay() {
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getTownID().isEmpty()){
            psMessage = "Town is not set.";
            return false;
        }
                
       
        
        
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}
