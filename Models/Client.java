package Models;

public class Client {
    private String names;
    private String lastnames;
    private String id;
    private int typeId;
    private String address;
    private String phoneNumber;
    private String email;

    public Client(String names, String lastnames, String id, int typeId, String address, String phoneNumber,
            String email) {
        this.names = names;
        this.lastnames = lastnames;
        this.id = id;
        this.typeId = typeId;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastnames() {
        return lastnames;
    }

    public void setLastnames(String lastnames) {
        this.lastnames = lastnames;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*
     * public static void main(String[] args) {
     * Validations test = new Validations();
     * if (test.validateID("1805472387"))
     * System.out.println("si es");
     * else
     * System.out.println("no es");
     * }
     */
}
