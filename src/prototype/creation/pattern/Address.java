package prototype.creation.pattern;

/**
 * @author namvh
 */
public class Address {

    private String country;
    private String city;

    public Address(){

    }
    public Address(String country, String city){
        this.city = city;
        this.country = country;
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

    @Override
    public String toString() {
        return "prototype.creation.pattern.Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
