/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.guanzon.cas.validators.client.parameter;

import org.guanzon.appdriver.base.GRider;
import org.guanzon.cas.model.clients.Model_Client_Mobile;
import org.guanzon.cas.model.clients.Model_Client_Social_Media;
import org.guanzon.cas.validators.ValidatorInterface;

/**
 *
 * @author User
 */
public class Validator_Client_Social_Media implements ValidatorInterface {
    GRider poGRider;
    String psMessage;
    
    Model_Client_Social_Media poEntity;
    
    public Validator_Client_Social_Media(Object foValue){
        poEntity = (Model_Client_Social_Media) foValue;
    }
    
    @Override
    public void setGRider(GRider foValue) {
//        poGRider = foValue;
    }

    @Override
    public boolean isEntryOkay() {
        if (poEntity.getSocialID().isEmpty()){
            psMessage = "Social ID is not set.";
            return false;
        }
        
        if (poEntity.getClientID().isEmpty()){
            psMessage = "Client ID is not set.";
            return false;
        }
        
        if (poEntity.getSocialAccount().isEmpty()){
            psMessage = "Social account is not set.";
            return false;
        }
        
        return true;
    }

    @Override
    public String getMessage() {
        return psMessage;
    }
}
