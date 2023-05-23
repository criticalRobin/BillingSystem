package Controllers;

import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;
import Models.ClientDao;

public class ClientController {

    public static boolean addClientController() {
        boolean result = true;
        String typeId;
        String id;
        String name;
        String Lastname;
        String email;
        String address;
        String phone;
        do {
            typeId = ScannerReader.readTypeID();
            if (!Validations.validateIDType(String.valueOf(typeId)))
                result = false;
            else
                result = true;
        } while (!result);

        do {
            id = ScannerReader.readID();
            if (typeId.equals("1"))
                if (!Validations.validateID(id))
                    result = false;
                else
                    result = true;
            else if (typeId.equals("2")){
                if (!Validations.validateRUC(id))
                    result = false;
                else
                    result = true;
            }
        } while (!result);

        do {
            name = ScannerReader.readName();
            if (!Validations.validateName(name))
                result = false;
            else
                result = true;
        } while (!result);

        do {
            Lastname = ScannerReader.readLastName();
            if (!Validations.validateLastName(Lastname))
                result = false;
            else
                result = true;
        } while (!result);

        do {
            email = ScannerReader.readEmail();
            if (!Validations.validateEmail(email))
                result = false;
            else
                result = true;
        } while (!result);

        do {
            address = ScannerReader.readAddress();
            if (!Validations.validateAddress(address))
                result = false;
            else
                result = true;
        } while (!result);

        do {
            phone = ScannerReader.readPhoneNumber();
            if (!Validations.validatePhoneNumber(phone))
                result = false;
            else
                result = true;
        } while (!result);

        ClientDao.insertClient(name.toUpperCase(), Lastname.toUpperCase(), id, typeId, address, phone, email);
        Messages.registerCliente();
        return result;
    }

    public static boolean updateClientController() {
        String id = ScannerReader.readID();
        if (Validations.validateID(id) || Validations.validateRUC(id)) {
            ClientDao.updateClient(id);
            return true;
        }
        return false;
    }

    public static boolean delateClientController() {
        String id = ScannerReader.readID();
        if (Validations.validateID(id) || Validations.validateRUC(id)) {
            ClientDao.deleteClient(id);
        }
        return false;
    }

}
