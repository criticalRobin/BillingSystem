package Models;

public class Client {
    private String fullname;
    private String id;
    private String typeId;
    private String address;
    private String phoneNumber;
    private String email;

    public String getFullname() {
        return fullname;
    }
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTypeId() {
        return typeId;
    }
    public void setTypeId(String typeId) {
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

    

    /*public static void main(String[] args) {
        Validations test = new Validations();
        if (test.validateID("1805472387"))
        System.out.println("si es");
        else
        System.out.println("no es");
    }*/
}
