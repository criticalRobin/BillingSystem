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
            } else
                result = true;
        } while (!result);

        do {
            name = ScannerReader.readName();
            if (!Validations.validateName(name)) {
                Messages.wrongName();
                result = false;
            } else
                result = true;
        } while (!result);

        do {
            Lastname = ScannerReader.readLastName();
            if (!Validations.validateLastName(Lastname)) {
                Messages.wrongLastName();
                result = false;
            } else
                result = true;
        } while (!result);

        do {
            email = ScannerReader.readEmail();
            if (!Validations.validateEmail(email)) {
                Messages.wrongEmail();
                result = false;
            } else
                result = true;
        } while (!result);

        do {
            address = ScannerReader.readAddress();
            if (!Validations.validateAddress(address)) {
                Messages.wrongAddress();
                result = false;
            } else
                result = true;
        } while (!result);

        do {
            phone = ScannerReader.readPhoneNumber();
            if (!Validations.validatePhoneNumber(phone)) {
                Messages.wrongPhoneNumber();
                result = false;
            } else
                result = true;
        } while (!result);
        ClientDao.insertClient(name, Lastname, Lastname, typeId, address, phone, email);
        Messages.registerCliente();
        return result;
    }
}
