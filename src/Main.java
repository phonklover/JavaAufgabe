public class Main {
    public static void main(String[] args) {
        Person person = new Person("Lorenz", "Iordachi", 20);
        System.out.println(person.fullName() + " is " + person.getAge() + " years old.");

        Employee employee = new Employee("Franz", "Gandolf", "002", 40);
        employee.setSalary(3000);
        System.out.println(employee.fullName() + " is " + employee.getAge() + " years old and has the ID: " + employee.getEmployeeID() + ", and earns a salary of " + employee.getSalary());

        employee.salaryIncrease(250);
        System.out.println("After salary increase: " + employee.fullName() + " earns a salary of " + employee.getSalary());

        employee.setEmployeeId("002");
        System.out.println("EmployeeID for " + employee.fullName() + " is: " + employee.getEmployeeID());
    }
}
