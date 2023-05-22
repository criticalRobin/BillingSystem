package Models;

import java.util.LinkedList;
import java.util.List;
import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;

public class ClientDao {
    List<Client> clients = new LinkedList<>();
    Validations validation = new Validations();
    
    //inserta a un cliente a la lista
    public boolean insertClient(String names, String lastnames, String id, String typeId, String address,
            String phoneNumber, String email) {
        try {
            clients.add(new Client(names, lastnames, id, typeId, address, phoneNumber, email));
            return true;
        } catch (Exception e) {
            Messages.errorMessage();
        }
        return false;
    }

    public boolean updateProductClient(String id) {
        try {
            for (Client client : clients) {
                if (client.getId().equals(id)) {    
                    do {
                        int option = ScannerReader.readUpdateClient();
                        switch (option) {
                            case 1:
                                String newName = ScannerReader.readName();
                                client.setNames(newName);
                                break;
                            case 2:
                                String newLastName = ScannerReader.readLastName();
                                client.setLastnames(newLastName);
                                break;
                            case 3:
                                String newAddress = ScannerReader.readAddress();
                                client.setAddress(newAddress);
                                break;
                            case 4:
                                String newEmail = ScannerReader.readEmail();
                                client.setEmail(newEmail);
                                break;
                            case 5:
                                String newPhone = ScannerReader.readPhoneNumber();
                                client.setPhoneNumber(newPhone);
                                break;
                            default:
                                Messages.switchDefaultMessage();
                                break;
                        }    
                    } while (validation.continueUpdate());
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

}
