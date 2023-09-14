public class Employee extends Person {

    private String employeeId;
    private float salary;

    public Employee(String name, String firstName, String employeeId, int age) {
        setName(name);
        setFirstName(firstName);
        setAge(age);
        this.employeeId = employeeId;
    }


    public String getEmployeeID() {
        return employeeId;
    }

    public float getSalary() {
        return salary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void salaryIncrease(float increaseAmount) {
        this.salary += increaseAmount;
    }

    public void printAll() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "This Employee's full name is " + getFirstName() + " " + getName() +
                ".\nHe/She is " + getAge() + " years old.\nEmployee ID is " + employeeId +
                " and the salary is " + salary + ".";
    }
}
