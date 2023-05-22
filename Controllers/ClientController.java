package Controllers;

import Complements.ScannerReader;
import Complements.Validations;

public class ClientController {
    
    public boolean addClientController(){
        int typeId = ScannerReader.readTypeID();
        if (!Validations.validateIDType(String.valueOf(typeId)))
            return false;
        String name = ScannerReader.readName();
        if (!Validations.validateName(name))
            return false;
        String Lastname = ScannerReader.readLastName();
        if (!Validations.validateLastName(Lastname))
            return false;
        String email = ScannerReader.readEmail();
        if (!Validations.validateEmail(email))
            return false;
        String address = ScannerReader.readAddress();
        if (!Validations.validateAddress(address))
            return false;
        String phone = ScannerReader.readPhoneNumber();
        if (!Validations.validatePhoneNumber(phone))
            return false;
        
            return false;
    }
}
