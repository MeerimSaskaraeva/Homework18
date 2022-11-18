public abstract class Apartment extends Person{
    private String familyName;
    private String address;


    public Apartment(Family[] name, String name1, String address) {
        super(name);
        this.familyName = name1;
        this.address = address;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Apartment{" +getClass() +"="+
                "familyName='" + familyName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
