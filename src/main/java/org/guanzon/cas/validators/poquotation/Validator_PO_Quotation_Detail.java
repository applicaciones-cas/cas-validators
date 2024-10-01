package org.guanzon.cas.validators.poquotation;

import java.util.ArrayList;
import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.inventory.models.Model_PO_Quotation_Detail;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author Michael Cuison
 */
public class Validator_PO_Quotation_Detail implements ValidatorInterface {

    GRider poGRider;
    String psMessage;
    private ArrayList<Model_PO_Quotation_Detail> poEntities;

    public Validator_PO_Quotation_Detail(ArrayList<Model_PO_Quotation_Detail> foValue) {
        poEntities = foValue;
    }

    @Override
    public void setGRider(GRider foValue) {
        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
       
        if (poEntities.size() == 1) {
            if (poEntities.get(0).getStockID().isEmpty() && (Integer) poEntities.get(0).getQuantity() >= 0
                        || poEntities.get(0).getDescription().isEmpty() && (Integer) poEntities.get(0).getQuantity() >= 0) {
                psMessage = "Unable to Save Empty Detail's";
                return false;
            }
        }
        // Loop through each entity and validate them
        for (Model_PO_Quotation_Detail poEntity : poEntities) {
            // Validate each entity's fields
                if (poEntity.getStockID().isEmpty() && (Integer) poEntity.getQuantity() <= 0
                        || poEntity.getDescription().isEmpty() && (Integer) poEntity.getQuantity() <= 0) {
                    psMessage = "There are unset Detail. Please verify your Entry";
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
