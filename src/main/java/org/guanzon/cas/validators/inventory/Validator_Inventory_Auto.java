package org.guanzon.cas.validators.inventory;

import org.guanzon.appdriver.base.GRider;
import  org.guanzon.cas.inventory.models.Model_Inventory;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_Inventory_Auto implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Inventory poEntity;
    
    public Validator_Inventory_Auto(Object foValue){
        poEntity = (Model_Inventory) foValue;
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
        if (poEntity.getCategCd1().isEmpty()){
            psMessage = "Category 1 is not set.";
            return false;
        }
        if (poEntity.getCategCd2().isEmpty()){
            psMessage = "Category 2 is not set.";
            return false;
        }
        if (poEntity.getInvTypeCode().isEmpty()){
            psMessage = "Inventory Type is not set.";
            return false;
        }
        if (poEntity.getBrandCode().isEmpty()){
            psMessage = "Brand is not set.";
            return false;
        }
        if (poEntity.getMinLevel() == null){ 
            psMessage = "Minimum Level is not set.";
            return false;
        }
        if (poEntity.getMaxLevel()== null){
            psMessage = "Maximum Level is not set.";
            return false;
        }
        if (poEntity.getUnitPrice()==null){
            psMessage = "Unit Price is not set.";
            return false;
        }
        if (poEntity.getSelPrice()==null){
            psMessage = "SRP is not set.";
            return false;
        }
        if (poEntity.getUnitType().isEmpty()){
            psMessage = "Unit Type is not set.";
            return false;
        }
        if (poEntity.getShlfLife()==null){
            psMessage = "ShelfLife is not set.";
            return false;
        }
        return true;
    }
    

    @Override
    public String getMessage() {
        return psMessage;
    }

}

