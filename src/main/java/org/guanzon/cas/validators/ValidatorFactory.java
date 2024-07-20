package org.guanzon.cas.validators;

import org.guanzon.cas.validators.account.Validator_AP_Client_Ledger;
import org.guanzon.cas.validators.account.Validator_AP_Client_Master;
import org.guanzon.cas.validators.account.Validator_AR_Client_Ledger;
import org.guanzon.cas.validators.account.Validator_AR_Client_Master;
import org.guanzon.cas.validators.account.Validator_Account_Accreditation;
import org.guanzon.cas.validators.client.parameter.Validator_Client_Master;
import org.guanzon.cas.validators.client.parameter.Validator_Client_Mobile;
import org.guanzon.cas.validators.inventory.Validator_Inventory;
import org.guanzon.cas.validators.inventory.Validator_Inventory_General;

/**
 *
 * @author Michael Cuison
 */
public class ValidatorFactory {
    public enum TYPE{
        Client_Master,
        Client_Mobile,
        Client_Address,
        Client_Mail,
        Client_Social_Media,
        Client_Institution_Contact,
        Account_Accreditation,
        AP_Client_Master,
        AP_Client_Ledger,
        AR_Client_Master,
        AR_Client_Ledger,
        AUTO,
        MP,
        MC,
        HOSPITALITY,
        GENERAL
    }
    public enum ClientTypes {
        PARAMETER,
        COMPANY,
        INDIVIDUAL,
        STANDARD;
    }
    
    public enum InventoryTypes {
        AUTO,
        MP,
        MC,
        HOSPITALITY,
        GENERAL;
    }
    
    public static ValidatorInterface make(ValidatorFactory.TYPE foType, Object foValue){
        switch (foType) {
            case Client_Master:
                return new Validator_Client_Master(foValue);
            case Client_Mobile:
                return new Validator_Client_Mobile(foValue);
            case Account_Accreditation:
                return new Validator_Account_Accreditation(foValue);
            case AP_Client_Master:
                return new Validator_AP_Client_Master(foValue);
            case AP_Client_Ledger:
                return new Validator_AP_Client_Ledger(foValue);
            case AR_Client_Master:
                return new Validator_AR_Client_Master(foValue);
            case AR_Client_Ledger:
                return new Validator_AR_Client_Ledger(foValue);
            case AUTO:
            case MC:
            case MP:
                return new Validator_Inventory(foValue);
            case HOSPITALITY:
            case GENERAL:
                return new Validator_Inventory_General(foValue);
            default:
                return null;
        }
    }
    
    
    
    public static ValidatorInterface make(ValidatorFactory.ClientTypes foCType, ValidatorFactory.TYPE foType,  Object foValue){
        switch (foType) {
            case Client_Master:
                switch (foCType) {
                    case PARAMETER:
                        return new org.guanzon.cas.validators.client.parameter.Validator_Client_Master(foValue);
                    case COMPANY:
                        return new org.guanzon.cas.validators.client.company.Validator_Client_Master(foValue);
                    case INDIVIDUAL:
                        return new org.guanzon.cas.validators.client.individual.Validator_Client_Master(foValue);
                    case STANDARD:
                        return new org.guanzon.cas.validators.client.standard.Validator_Client_Master_Standard(foValue);
                }
            case Client_Address:
                
                switch (foCType) {
                    case PARAMETER:
                        return new org.guanzon.cas.validators.client.parameter.Validator_Client_Address(foValue);
                    case COMPANY:
                        return new org.guanzon.cas.validators.client.company.Validator_Client_Address(foValue);
                    case INDIVIDUAL:
                        return new org.guanzon.cas.validators.client.individual.Validator_Client_Address(foValue);
                    case STANDARD:
                        return new org.guanzon.cas.validators.client.standard.Validator_Client_Address_Standard(foValue);
                }
            case Client_Mobile:
                
                switch (foCType) {
                    case PARAMETER:
                        return new org.guanzon.cas.validators.client.parameter.Validator_Client_Mobile(foValue);
                    case COMPANY:
                        return new org.guanzon.cas.validators.client.company.Validator_Client_Mobile(foValue);
                    case INDIVIDUAL:
                        return new org.guanzon.cas.validators.client.individual.Validator_Client_Mobile(foValue);
                    case STANDARD:
                        return new org.guanzon.cas.validators.client.standard.Validator_Client_Mobile_Standard(foValue);
                }
            case Client_Mail:
                
                switch (foCType) {
                    case PARAMETER:
                        return new org.guanzon.cas.validators.client.parameter.Validator_Client_Mail(foValue);
                    case COMPANY:
                        return new org.guanzon.cas.validators.client.company.Validator_Client_Mail(foValue);
                    case INDIVIDUAL:
                        return new org.guanzon.cas.validators.client.individual.Validator_Client_Mail(foValue);
                    case STANDARD:
                        return null;
                }
            case Client_Social_Media:
                
                switch (foCType) {
                    case PARAMETER:
                        return new org.guanzon.cas.validators.client.parameter.Validator_Client_Social_Media(foValue);
                    case COMPANY:
//                        return new org.guanzon.cas.validators.client.company.Validator_Client_Social_Media(foValue);
                        return null;
                    case INDIVIDUAL:
                        return new org.guanzon.cas.validators.client.individual.Validator_Client_Social_Media(foValue);
                    case STANDARD:
                        return null;
                }
                
            case Client_Institution_Contact: 
                
                switch (foCType) {
                    case PARAMETER:
                        return new org.guanzon.cas.validators.client.parameter.Validator_Client_Institution_Contact(foValue);
                    case COMPANY:
                        return new org.guanzon.cas.validators.client.company.Validator_Client_Institution_Contact(foValue);
                    case INDIVIDUAL:
                        return null;
                    case STANDARD:
                        return null;
                }
            default:
                return null;
        }
    }
    
    
}
