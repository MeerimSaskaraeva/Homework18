public class Flat extends Apartment implements LivePayable{

    public Flat(Family[] name, String name1, String address) {
        super(name, name1, address);
    }

    @Override
    public int payRent(String[] family) {
        int counter=0;
        for (int i = 0; i < family.length; i++) {
            counter++;
        }
        return counter;
    }

    @Override
    public int payUtilities(String[] family) {

        return family.length;
    }
}
