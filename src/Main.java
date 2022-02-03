import java.util.Scanner;

public class Main {

    private static final String KIDSPRICE = "de franc";
    private static final int TEENSPRICE = 5;
    private static final int ADULTSPRICE = 10;

    public static void main(String[] args) {

        int age = askForAge();

        if (age < 4) {
            System.out.println(" la teva entrada es " + KIDSPRICE);
        } else if (age >= 4 && age <= 18) {
            System.out.println(" la teva entrada costa " + TEENSPRICE);
        } else {
            System.out.println("la teva entrada costa " + ADULTSPRICE);
        }

    }

    private static int askForAge() {
        System.out.println("introdueix la teva edat. ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }
}
