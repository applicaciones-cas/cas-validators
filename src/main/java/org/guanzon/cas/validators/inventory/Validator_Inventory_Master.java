package org.guanzon.cas.validators.inventory;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.inventory.Model_Inv_Master;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Inventory_Master implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Inv_Master poEntity;
    
    public Validator_Inventory_Master(Object foValue){
        poEntity = (Model_Inv_Master) foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }
    @Override
    public boolean isEntryOkay() {
        
        if (poEntity.getLocatnCode().isEmpty()){
            psMessage = "Location is not set.";
            return false;
        }
        if (poEntity.getWareHouseID().isEmpty()){
            psMessage = "Warehouse is not set.";
            return false;
        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

