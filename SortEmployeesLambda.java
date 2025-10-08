import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getSalary() { return salary; }

    // toString method for easy display
    @Override
    public String toString() {
        return String.format("Name: %-10s | Age: %-3d | Salary: %.2f", name, age, salary);
    }
}

public class SortEmployeesLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        
        employees.add(new Employee("Ravi", 28, 55000));
        employees.add(new Employee("Anita", 35, 72000));
        employees.add(new Employee("Karan", 25, 48000));
        employees.add(new Employee("Neha", 30, 65000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sort by name (alphabetically)
        employees.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        System.out.println("\nSorted by Name (Alphabetically):");
        employees.forEach(System.out::println);

        // Sort by age (ascending)
        employees.sort((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        System.out.println("\nSorted by Age (Ascending):");
        employees.forEach(System.out::println);

        // Sort by salary (descending)
        employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nSorted by Salary (Descending):");
        employees.forEach(System.out::println);
    }
}
