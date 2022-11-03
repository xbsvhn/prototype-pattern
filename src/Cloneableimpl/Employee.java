package Cloneableimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author namvh
 */
public class Employee implements Cloneable{

    private List<String> employees;

    public Employee(){
        employees = new ArrayList<>();
    }
    public Employee(List<String> employees){
        this.employees = employees;
    }

    public void loadData(){
       employees.add("EC1");
       employees.add("EC2");
       employees.add("EC3");
       employees.add("EC4");

    }
    public List<String> getEmployees(){
        return employees;
    }


    //clone method is overridden to provide a deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        for (String str : employees) {
            list.add(str);
        }
        return new Employee(list);
    }
}
