public class Main {
    public static void main(String[] args) {

        Apartment apartment1=new Hostel(new Family[10],"Mamytovi","VOSST");
        Apartment apartment2=new Hotel(new Family[5],"Osmonovi","Pishpeck");
        Apartment apartment3=new Flat(new Family[8],"Usupovi","Kemin");

        LivePayable live1=new Hostel(new Family[10],"Mamytovi","VOSST");
        LivePayable live2=new Hotel(new Family[5],"Osmonovi","Pishpeck");
        LivePayable live3=new Flat(new Family[8],"Usupovi","Kemin");

        System.out.println(apartment1.toString()+" Live: "+live1.payRent(new String[]{"Aybek", "Ilim", "Mika", "Sasha"})+" people");
        System.out.println(apartment2.toString()+" Live: "+live2.payRent(new String[]{"Aybek","Ilim","Nina","Lira","Osmon","Malika"})+" people");
        System.out.println(apartment3.toString()+" Live: "+live3.payUtilities(new String[]{"Aybek","Nina","Lira","Mama","Papa"})+" people");



    }
}