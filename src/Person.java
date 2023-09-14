public class Person {

    private String name;
    private String firstName;
    private int age;

    public Person(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }


    public Person() {}


    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge(){
        return age;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
    }

    public String fullName() {
        return firstName + " " + name;
    }

    @Override
    public String toString(){
        return "This person´s name is "+ fullName() +" and he is " + age + " years old.";
    }
}
