package Cloneableimpl;

import java.util.List;

/**
 * @author namvh
 */
public class PrototypePatternTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.loadData();

        Employee clone = (Employee) employee.clone();
        Employee clone1 = (Employee) employee.clone();

        List<String> listClone = clone.getEmployees();
        listClone.add("namvh");
        List<String> listClone2 = clone1.getEmployees();
        listClone2.remove("EC1");

        System.out.println(employee.getEmployees());
        System.out.println(listClone);
        System.out.println(listClone2);

    }
}
