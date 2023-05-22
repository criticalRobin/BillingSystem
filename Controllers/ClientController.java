package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ClientDao;

public class ClientController {

    public boolean addClientController() {
        boolean result = true;
        int typeId;
        String name;
        String Lastname;
        String email;
        String address;
        String phone;
        do {
            typeId = ScannerReader.readTypeID();
            if (!Validations.validateIDType(String.valueOf(typeId))) {
                Messages.wrongTypeID();
                result = false;
            }else
                result = true;
        } while (!result);

        do {
            name = ScannerReader.readName();
            if (!Validations.validateName(name)) {
                Messages.wrongName();
                result = false;
            }else
                result = true;
        } while (!result);
        Lastname = ScannerReader.readLastName();
        if (!Validations.validateLastName(Lastname))
            return false;
        email = ScannerReader.readEmail();
        if (!Validations.validateEmail(email))
            return false;
        address = ScannerReader.readAddress();
        if (!Validations.validateAddress(address))
            return false;
        phone = ScannerReader.readPhoneNumber();
        if (!Validations.validatePhoneNumber(phone))
            return false;
        ClientDao.insertClient(name, Lastname, Lastname, typeId, address, phone, email);
        Messages.registerCliente();
        return true;
    }
}
