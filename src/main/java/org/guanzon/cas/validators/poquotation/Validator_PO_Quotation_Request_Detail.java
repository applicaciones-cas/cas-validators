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
public class Validator_PO_Quotation_Request_Detail implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    Model_PO_Quotation_Request_Detail poEntity;
//    Model_PO_Quotation_Request_Master poEntity;
    private ArrayList<Model_PO_Quotation_Request_Detail> poEntities;
    
    public Validator_PO_Quotation_Request_Detail() {
        poEntities = new ArrayList<>();
    }
    
    public Validator_PO_Quotation_Request_Detail(ArrayList<Model_PO_Quotation_Request_Detail> foValue){
        poEntities = foValue;
    }
    
//    public void addEntity(Object foValue) {
//        if (foValue instanceof Model_PO_Quotation_Request_Detail) {
//            poEntities.add((Model_PO_Quotation_Request_Detail) foValue);
//        } else {
//            throw new IllegalArgumentException("Invalid object type. Expected Model_PO_Quotation_Request_Detail.");
//        }
//    }
    
//    public ArrayList<Model_PO_Quotation_Request_Detail> getEntities() {
//        return poEntities;
//    }
    

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }
    
    @Override
    public boolean isEntryOkay() {
        // Loop through each entity and validate them
        for (Model_PO_Quotation_Request_Detail poEntity : poEntities) {
            // Validate each entity's fields
            if (String.valueOf(poEntity.getEntryNo()).isEmpty()) {
                psMessage = "There are no entries set.";
                return false;
            }
            if (poEntity.getStockID().isEmpty() || poEntity.getDescript().isEmpty()) {
                psMessage = "Items are not set.";
                return false;
            }
            if (String.valueOf(poEntity.getQuantity()).isEmpty()) {
                psMessage = "Quantity is not set.";
                return false;
            }
        }
        // If all entities are valid, return true
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

