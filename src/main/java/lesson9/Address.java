package lesson9;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

}

class Main {
    public static void main(String[] args) {
        Address myAddress = new Address();
        myAddress.setIndex(9700);
        myAddress.setCountry("Ukraine");
        myAddress.setCity("Mariupol");
        myAddress.setStreet("Amurska");
        myAddress.setHouse(9);
        myAddress.setApartment(19);

        System.out.println(myAddress.getIndex());
        System.out.println(myAddress.getCountry());
        System.out.println(myAddress.getCity() + "," + " " + myAddress.getStreet() + " " + myAddress.getHouse() + "," + " " + "app." + " " + myAddress.getApartment());


    }
}




