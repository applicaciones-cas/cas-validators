package org.guanzon.validators;

import org.guanzon.validators.client.Validator_Client_Master;
import org.guanzon.validators.client.Validator_Client_Mobile;

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
        Client_Institution_Contact
    }
    
    public static ValidatorInterface make(ValidatorFactory.TYPE foType, Object foValue){
        switch (foType) {
            case Client_Master:
                return new Validator_Client_Master(foValue);
            case Client_Mobile:
                return new Validator_Client_Mobile(foValue);
            default:
                return null;
        }
    }
}
