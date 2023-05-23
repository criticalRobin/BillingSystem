package Models;

import java.util.LinkedList;
import java.util.List;
import Complements.Messages;
import Complements.ScannerReader;
import Complements.Validations;

public class ClientDao {
    public static List<Client> clients = new LinkedList<>();

    // inserta a un cliente a la lista
    public static boolean insertClient(String names, String lastnames, String id, String typeId, String address,
            String phoneNumber, String email) {
        try {
            clients.add(new Client(names, lastnames, id, typeId, address, phoneNumber, email));
            return true;
        } catch (Exception e) {
            Messages.errorMessage();
        }
        return false;
    }

    public static boolean updateClient(String id) {
        try {
            for (Client client : clients) {
                if (client.getId().equals(id)) {
                    do {
                        String option = ScannerReader.readUpdateClient();
                        switch (option) {
                            case "1":
                                String newName = ScannerReader.readName().toUpperCase();
                                if (Validations.validateName(newName)) {
                                    client.setNames(newName);
                                    System.out.println(client.getNames());
                                    Messages.modificateCliente();
                                }
                                break;
                            case "2":
                                String newLastName = ScannerReader.readLastName().toUpperCase();
                                if (Validations.validateLastName(newLastName)) {
                                    client.setLastnames(newLastName);
                                    System.out.println(client.getLastnames());
                                    Messages.modificateCliente();
                                }
                                break;
                            case "3":
                                String newAddress = ScannerReader.readAddress();
                                if (Validations.validateAddress(newAddress)) {
                                    client.setAddress(newAddress);
                                    System.out.println(client.getAddress());
                                    Messages.modificateCliente();
                                }
                                break;
                            case "4":
                                String newEmail = ScannerReader.readEmail();
                                if (Validations.validateEmail(newEmail)) {
                                    client.setEmail(newEmail);
                                    System.out.println(client.getEmail());
                                    Messages.modificateCliente();
                                }
                                break;
                            case "5":
                                String newPhone = ScannerReader.readPhoneNumber();
                                if (Validations.validatePhoneNumber(newPhone)) {
                                    client.setPhoneNumber(newPhone);
                                    System.out.println(client.getPhoneNumber());
                                    Messages.modificateCliente();
                                }
                                break;
                            default:
                                Messages.switchDefaultMessage();
                                break;
                        }
                    } while (Validations.continueUpdate("Clientes"));
                }
            }
            return true;
        } catch (NullPointerException ex) {
            Messages.errorMessage();
            return false;
        }
    }

    public static boolean deleteClient(String id) {
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

    public static String printlist() {
        String lista = "";
        String support = "";
        for (int i = 0; i < clients.size(); i++) {
            support = clients.get(i).toString();
            lista = lista + support;
        }
        return lista;
    }
}
