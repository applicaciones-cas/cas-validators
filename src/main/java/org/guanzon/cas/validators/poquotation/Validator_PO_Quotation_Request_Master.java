package org.guanzon.cas.validators.poquotation;


import java.util.ArrayList;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.inventory.models.Model_PO_Quotation_Request_Detail;
import org.guanzon.cas.inventory.models.Model_PO_Quotation_Request_Master;

import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_PO_Quotation_Request_Master implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_PO_Quotation_Request_Master poEntity;
    
    public Validator_PO_Quotation_Request_Master(Object foValue){
        poEntity = (Model_PO_Quotation_Request_Master) foValue;
    }
    

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }
    @Override
    public boolean isEntryOkay() {
        if (poEntity.getTransactionNumber().isEmpty()){
            psMessage = "Transaction Number is not set.";
            return false;
        }
        if (poEntity.getDestination().isEmpty()){
            psMessage = "Destination is not set.";
            return false;
        }
        if (poEntity.getCategoryCode().isEmpty()){
            psMessage = "Category is not set.";
            return false;
        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

