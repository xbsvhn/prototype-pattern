package prototype.creation.pattern;

/**
 * @author namvh
 */
public class PrototypePatternTest {
    public static void main(String[] args) {
        Address address = new Address("VN", "HN");
        Employee employee = new Employee("ec", address);

        Employee shallow = employee.shallow();
        Employee deep = employee.deep();

        System.out.println("Before change address:");
        System.out.println("original: " + employee);
        System.out.println("shallow copy: " + shallow);
        System.out.println("deep copy: " + deep);

        System.out.println("After shallow change address:");
        shallow.getAddress().setCountry("Sing");
        System.out.println("original: " + employee);
        System.out.println("shallow copy: " + shallow);
        System.out.println("deep copy: " + deep);

        System.out.println("After deep change address:");
        deep.getAddress().setCountry("Phil");
        System.out.println("original: " + employee);
        System.out.println("shallow copy: " + shallow);
        System.out.println("deep copy: " + deep);
    }
}
