public class User_Input {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double length = s1.nextDouble();
        System.out.println("What is the breadth of the rectangle?");
        double breadth = s1.nextDouble();
        int area = (int) (breadth * length);
        System.out.println("The area is " + area);

    }

}
