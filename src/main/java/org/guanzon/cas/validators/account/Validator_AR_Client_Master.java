package org.guanzon.cas.validators.account;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.ar.Model_AR_Client_Master;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_AR_Client_Master implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_AR_Client_Master poEntity;
    
    public Validator_AR_Client_Master(Object foValue){
        poEntity = (Model_AR_Client_Master) foValue;
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
        if (poEntity.getCategoryCode().isEmpty()){
            psMessage = "Category is not set.";
            return false;
        }
        if (poEntity.getTerm().isEmpty()){
            psMessage = "Term is not set.";
            return false;
        }
//        if (poEntity.getContctID().isEmpty()){
//            psMessage = "Contact ID is not set.";
//            return false;
//        }
//        if (poEntity.getBeginDate()== null){
//            psMessage = "Client beginning date is not set.";
//            return false;
//        }
//        if (poEntity.getClientSince()== null){
//            psMessage = "Client since date is not set.";
//            return false;
//        }
//        
//        if (Double.parseDouble(poEntity.getBeginBal().toString()) <= 0){
//            psMessage = "Client since date is not set.";
//            return false;
//        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

