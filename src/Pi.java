import java.util.Scanner;

public class Pi {
    public static void p() {
        Scanner in = new Scanner(System.in);

        int sequence;
        double numbers = 0;
        System.out.print("Insert the quantity of iterations : ");
        sequence = in.nextInt();
        for (int i = 1; i <= sequence; i++) {
            int divis = 2 * i - 1;
            if (i % 2 == 1) {
                numbers = numbers + 1.0f / divis;
            } else {
                numbers = numbers - 1.0f / divis;
            }
            System.out.println(i + " iteration of pi =" + (4 * numbers));

        }
    }
}
