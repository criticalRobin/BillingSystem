package Controllers;

import Complements.ScannerReader;
import Complements.Validations;

public class ClientController {
    public boolean addClientController(){
        int typeId = ScannerReader.readTypeID();
        
        String name = ScannerReader.readName();
        if (!Validations.validateName(name))
            return false;
        String Lastname = ScannerReader.readLastName();
        if (!Validations.validateLastName(Lastname))
            return false;
         
        return false;
    }
}
