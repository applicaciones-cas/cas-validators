package org.guanzon.cas.validators.inventory;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.inventory.models.Model_Inventory_Sub_Unit;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Inventory_Sub_Unit implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Inventory_Sub_Unit poEntity;
    
    public Validator_Inventory_Sub_Unit(Object foValue){
        poEntity = (Model_Inventory_Sub_Unit) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }
    @Override
    public boolean isEntryOkay() {
        if (!poEntity.getSubItemID().isEmpty()){
            if (Double.parseDouble(poEntity.getQuantity().toString())<=0.0){
                psMessage = "Quantity of " + poEntity.getSubItemDescription()+ " is not set.";
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String getMessage() {
        return psMessage;
    }

}

