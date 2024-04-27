package org.guanzon.cas.validators.client.parameter;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.Model_Client_Institution_Contact;
import org.guanzon.cas.model.clients.Model_Client_Institution_Contact;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Client_Institution_Contact implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Institution_Contact poEntity;
    
    public Validator_Client_Institution_Contact(Object foValue){
        poEntity = (Model_Client_Institution_Contact) foValue;
    }
    
    @Override
    public void setGRider(GRider foValue) {
//        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {

         if (poEntity.getContactID().isEmpty()){
            psMessage = "Contact ID is not set.";
            return false;
        }
         
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getContactPerson().isEmpty()){
            psMessage = "Contact Person is not set.";
            return false;
        }
        
        if (poEntity.getContactPersonPosition().isEmpty()){
            psMessage = "Contact Person Position is not set.";
            return false;
        }
        
        if (poEntity.getContactPersonMobileNo().isEmpty()){
            psMessage = "Contact Person Mobile No. is not set.";
            return false;
        }
        
        if (poEntity.getContactPersonsEmail().isEmpty()){
            psMessage = "Contact Person Email is not set.";
            return false;
        }
        
        
        return true;
    }

    @Override
    public String getMessage() {
        return psMessage;
    }
}
