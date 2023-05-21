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
                    int option = ScannerReader.readUpdateProductOption();
                    switch (option) {
                        case 1:
                            String newName = ScannerReader.readProductName();
                            pro.setName(newName);
                            break;
                        case 2:
                            double newPrice = ScannerReader.readProductPriceByUnit();
                            pro.setPriceByUnit(newPrice);
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
