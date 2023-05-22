package Models;

import java.util.LinkedList;
import java.util.List;
import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;

public class ClientDao {
    List<Client> clients = new LinkedList<>();
   
    
    //inserta a un cliente a la lista
    public boolean insertClient(String names, String lastnames, String id, int typeId, String address,
            String phoneNumber, String email) {
        try {
            clients.add(new Client(names, lastnames, id, typeId, address, phoneNumber, email));
            return true;
        } catch (Exception e) {
            Messages.errorMessage();
        }
        return false;
    }

    public boolean updateClient(String id) {
        try {
            for (Client client : clients) {
                if (client.getId().equals(id)) {    
                    do {
                        int option = ScannerReader.readUpdateClient();
                        switch (option) {
                            case 1:
                                String newName = ScannerReader.readName();
                                if (Validations.validateName(newName)){
                                client.setNames(newName);
                                break;
                                }
                                Messages.wrongName();
                                break;
                            case 2:
                                String newLastName = ScannerReader.readLastName();
                                if (Validations.validateLastName(newLastName)){
                                client.setLastnames(newLastName);
                                break;
                                }
                                Messages.wrongLastName();
                                break;
                            case 3:
                                String newAddress = ScannerReader.readAddress();
                                if (Validations.validateAddress(newAddress)){
                                client.setAddress(newAddress);
                                break;
                                }
                                Messages.wrongAddress();
                                break;
                            case 4:
                                String newEmail = ScannerReader.readEmail();
                                if (Validations.validateEmail(newEmail)){
                                client.setEmail(newEmail);
                                break;
                                }
                                Messages.wrongEmail();
                                break;
                            case 5:
                                String newPhone = ScannerReader.readPhoneNumber();
                                if (Validations.validatePhoneNumber(newPhone)){
                                client.setPhoneNumber(newPhone);
                                break;
                                }
                                Messages.wrongPhone();
                                break;
                            default:
                                Messages.switchDefaultMessage();
                                break;
                        }    
                    } while (Validations.continueUpdate());
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public boolean deleteClient(String id) {
        try {
            for (Client client : clients) {
                if (client.getId().equals(id)) {
                    clients.remove(client);
                    Messages.eliminateCliente();
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }
}
