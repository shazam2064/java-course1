
public class Examples {

    private int accountBalance;

    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }

        else {
         System.out.println("You cannot have negative age.");
        }

    }


}
