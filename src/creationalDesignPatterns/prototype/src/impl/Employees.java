package creationalDesignPatterns.prototype.src.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Employees.
 * Notice that the clone method is overridden to provide a deep copy of the employees list.
 * Date: 01/13/2018
 *
 * @author Mikalai Bezmen
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Employees(new ArrayList<>(this.getEmpList()));
    }
}
