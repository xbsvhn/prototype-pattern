package prototype.creation.pattern;

/**
 * @author namvh
 */
public class Employee {

    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Employee() {

    }

    //method shallowCopy chỉ copy reference object address bên trong
    public Employee shallow() {

        Employee employee = new Employee(this.name, this.address);
        return employee;

    }


    //method deepCopy sẽ tạo một đối tượng address mới giống đối tượng address ban đầu vào đối tượng được copy.
    public Employee deep() {

        Address address = new Address(this.getAddress().getCountry(), this.getAddress().getCity());
        Employee employee = new Employee(this.name, address);
        return employee;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "prototype.creation.pattern.Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
