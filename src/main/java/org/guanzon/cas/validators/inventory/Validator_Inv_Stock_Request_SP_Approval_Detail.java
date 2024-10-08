package org.guanzon.cas.validators.inventory;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.inventory.models.Model_Inv_Stock_Request_Detail;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Inv_Stock_Request_SP_Approval_Detail implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Inv_Stock_Request_Detail poEntity;
    
    public Validator_Inv_Stock_Request_SP_Approval_Detail(Object foValue){
        poEntity = (Model_Inv_Stock_Request_Detail) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }
    @Override
    public boolean isEntryOkay() {
        
        if (poEntity.getBarcode().isEmpty()){
            psMessage = "Barcode is not set.";
            return false;
        } 
        if (poEntity.getDescription().isEmpty()){
            psMessage = "Description is not set.";
            return false;
        }
//        
//        if (poEntity.getBrandCode().isEmpty()){
//            psMessage = "Brand is not set.";
//            return false;
//        }
//        if (poEntity.getModelCode().isEmpty()){
//            psMessage = "Model is not set.";
//            return false;
//        }
//        
//        if (poEntity.getColorCode().isEmpty()){
//            psMessage = "Color is not set.";
//            return false;
//        }
        System.out.println("getOrderQuantity = " + poEntity.getOrderQuantity());
        if (Double.parseDouble(String.valueOf(poEntity.getQuantity()))<=0.0){
            psMessage = "Quantity Request is not set.";
            return false;
        }
//        if(Double.parseDouble(String.valueOf(poEntity.getApproved()))>Double.parseDouble(String.valueOf(poEntity.getQuantity()))){
//            psMessage = "Required";
//            return false;
//        }
//        if (Double.parseDouble(poEntity.getQuantity().toString())<=0.0){
//            psMessage = "Quantity Request is not set.";
//            return false;
//        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

