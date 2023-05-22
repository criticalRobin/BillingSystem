package Models;

import java.util.LinkedList;
import java.util.List;
import Complements.Messages;
import Complements.ScannerReader;

public class ClientDao {
    List<Client> clients = new LinkedList<>();

    public boolean insertClient(String names, String lastnames, String id, String typeId, String address, String phoneNumber, String email) {
        try {
            clients.add(new Client(names,lastnames, id, typeId, address, phoneNumber, email));
            return true;
        } catch (Exception e) {
            Messages.errorMessage();
        }
        return false;
    }

    public boolean updateProductClient(String id){
        try {
            for (Client client : clients) {
                if (client.getId().equals(id)) {
                    int option = ScannerReader.readUpdateClient();
                    switch (option) {
                        case 1:
                            String newName = ScannerReader.readName();
                            client.setNames(newName);
                            break;
                        case 2:
                            double newPrice = ScannerReader.readProductPriceByUnit();
                            client.setEmail(String.valueOf(newPrice));
                            break;
                        default:
                            Messages.switchDefaultMessage();
                            break;
                    }
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

}
