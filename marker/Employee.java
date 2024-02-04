package marker;

import java.util.ArrayList;
import java.util.List;

class Employee implements IEmployee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "Id: " + id + ", Name: " + name + ", Salary: " + salary + "]";
    }
}
class Customer{
    private int id;
    private String name;
    private int budget;

    public Customer(int id, String name, int budget){
        this.id = id;
        this.name = name;
        this.budget = budget;
    }
    public String toString(){
        return "Id: " + id + ", Name: " + name + ", Salary: " + budget + "]";
    }
}
class CustomEmployeeMarkerDemo{
    static List<Employee> employeeList = new ArrayList<>();
    static List<Customer> customerList = new ArrayList<>();

    public static boolean saveListData(Object ob){
        if (ob instanceof Employee){
            employeeList.add((Employee) ob);
        }else{
            customerList.add((Customer)ob);
        }
        return true;
    }
    public static void main(String[] args) {
        Employee employee = new Employee(2,"Rob Stark",10000);
        saveListData(employee);
        Employee employee2 = new Employee(3,"Aria Stark",30000);
        saveListData(employee2);
        Customer customer = new Customer(3,"Robert Baratheon",40000);
        saveListData(customer);
        Customer customer2 = new Customer(5,"Jaime Lannister",50000);
        saveListData(customer2);
        System.out.println("Employee's List is " + employeeList);
        System.out.println("Customer's List is " + customerList);
    }
}