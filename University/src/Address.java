public class Address {
    String city;
    String street;
    int house;
    int flat;

    public Address(String city, String street, int house, int flat) {
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }



    @Override
    public String toString() {

        return this.city + " " + this.street + " " + this.house + " " + this.flat;
    }

}
