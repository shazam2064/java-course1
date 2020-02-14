
public class Main {

    public static void main(String[] args) {

        Job newJob = new Job( 300, "Teacher", 85769);
        String name = "nilesh";
        Person employee = new Person(name, 50, newJob);

        System.out.println("Nilesh's name is " + employee.getName());

        System.out.println("Nilesh's age is " + employee.getAge());

        System.out.println("Nilesh's ID is " + employee.getID());

        System.out.println("Nilesh's Salary is " + employee.getSalary());

        System.out.println("Nilesh's Role is " + employee.getRole());

    }

}
